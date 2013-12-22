package edu.unq.xml;

import java.io.FileWriter;
import java.io.IOException;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.namespace.QName;

public class XMLParser<T> {
	
	
	JAXBElement<T> jaxbElement;
	private Marshaller marshaller;

	public XMLParser(T dataObject) {
		JAXBContext jcontext;
		
		@SuppressWarnings("unchecked")
		Class<T> clazz = (Class<T>) dataObject.getClass();
		
		try {
			jcontext = JAXBContext.newInstance(clazz);
			this.marshaller = jcontext.createMarshaller();
			this.marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			jaxbElement = new JAXBElement<T>(new QName("root"), clazz, dataObject);
		
		} catch (JAXBException e) {
			e.printStackTrace();
		}
	}
	
	public void parseAndSave(String location){
		try {
			FileWriter writer = new FileWriter(location);			
			marshaller.marshal(jaxbElement, writer);
		} catch (IOException e) {
			e.printStackTrace();
		} catch (JAXBException e) {
			e.printStackTrace();
		}
	}
}
