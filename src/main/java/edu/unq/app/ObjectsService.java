package edu.unq.app;

import java.util.LinkedList;
import java.util.List;

import edu.unq.ObjectExample;

public class ObjectsService {
	
	public static ObjectsService GENERATED_DATA = generateData();
	
	private List<ObjectExample> objectExamples;
	
	public ObjectsService() {
		objectExamples = new LinkedList<ObjectExample>();
	}
	
	private static ObjectsService generateData() {
		return new ObjectsService()
		  .add(new  ObjectExample("Object1", 1)
		    .addItemByData("Item1", 1)
		    .addItemByData("Item2", 2)
		  )
		  .add(new  ObjectExample("Object2", 2)
		    .addItemByData("Item3", 3)
		  )
		  .add(new  ObjectExample("Object3", 3)
		  )
		;
	}

	public ObjectsService add(ObjectExample objectExample){
		this.objectExamples.add(objectExample);
		return this;
	}

	public List<ObjectExample> getObjectExamples() {
		return objectExamples;
	}

	public void setObjectExamples(List<ObjectExample> objectExamples) {
		this.objectExamples = objectExamples;
	}
	
	
}
