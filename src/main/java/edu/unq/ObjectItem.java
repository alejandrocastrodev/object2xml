package edu.unq;

public class ObjectItem {

	private String itemName;
	private Integer itemId;
		
	public ObjectItem(String itemName, Integer itemId) {
		super();
		this.itemName = itemName;
		this.itemId = itemId;
	}
	
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public Integer getItemId() {
		return itemId;
	}
	public void setItemId(Integer itemId) {
		this.itemId = itemId;
	}
	
	
	
}
