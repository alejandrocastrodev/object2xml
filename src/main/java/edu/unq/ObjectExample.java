package edu.unq;
import java.util.LinkedList;
import java.util.List;


public class ObjectExample {

	private String objectName;
	private Integer objectId;
	private List<ObjectItem> items;
	
	public ObjectExample() {
		items = new LinkedList<ObjectItem>();
	}
	
	public ObjectExample(String objectName, Integer objectId) {
		this(); //run empty constructor and initialize the List
		this.objectName = objectName;
		this.objectId = objectId;
	}

	public ObjectExample addItemByData(String itemName, Integer itemId) {
		this.items.add(new ObjectItem(itemName, itemId));
		return this;
	}
	
	public void addItem(ObjectItem item) {
		this.items.add(item);
	}
	
	public void removeItem(ObjectItem item) {
		this.items.remove(item);
	}
	
	public String getObjectName() {
		return objectName;
	}
	public void setObjectName(String objectName) {
		this.objectName = objectName;
	}
	public Integer getObjectId() {
		return objectId;
	}
	public void setObjectId(Integer objectId) {
		this.objectId = objectId;
	}
	public List<ObjectItem> getItems() {
		return items;
	}
	public void setItems(List<ObjectItem> items) {
		this.items = items;
	}
	
	
	
}
