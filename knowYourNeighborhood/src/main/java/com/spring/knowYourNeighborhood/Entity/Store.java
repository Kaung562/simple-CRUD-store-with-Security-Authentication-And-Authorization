package com.spring.knowYourNeighborhood.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="storeinformation")
public class Store {
  @Id
   Long storeId;
   String storeName;
   String storeNumber;
   String location;

public Store() {
	super();
	// TODO Auto-generated constructor stub
}
public Store(Long storeId, String storeName, String storeNumber, String location) {
	super();
	this.storeId = storeId;
	this.storeName = storeName;
	this.storeNumber = storeNumber;
	this.location = location;
}
public Long getStoreId() {
	return storeId;
}
public void setStoreId(Long storeId) {
	this.storeId = storeId;
}
public String getStoreName() {
	return storeName;
}
public void setStoreName(String storeName) {
	this.storeName = storeName;
}
public String getStoreNumber() {
	return storeNumber;
}
public void setStoreNumber(String storeNumber) {
	this.storeNumber = storeNumber;
}
public String getLocation() {
	return location;
}
public void setLocation(String location) {
	this.location = location;
}
@Override
public String toString() {
	return "Store [storeId=" + storeId + ", storeName=" + storeName + ", storeNumber=" + storeNumber + ", location="
			+ location + "]";
}

}
