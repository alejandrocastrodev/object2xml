package edu.unq.app;

import edu.unq.xml.XMLParser;


public class App {

	private static ObjectsService service;
	private static XMLParser<ObjectsService> parser;
	
	public static void main(String[] args) {
		
		service = ObjectsService.GENERATED_DATA;			
		parser = new XMLParser<ObjectsService>(service);
		parser.parseAndSave("D:/file.xml");

	}

}
