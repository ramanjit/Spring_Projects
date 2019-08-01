package com.raman;
import java.util.*;

public class AddressCollection {
List addressList;
Set addressSet;
Map adressMap;
Properties addressProp;

public List getAddressList() {
	System.out.println("List Elements  : " + addressList);
	return addressList;
}
public void setAddressList(List addressList) {
	this.addressList = addressList;
}
public Set getAddressSet() {
	System.out.println("Set Elements  : " + addressSet);
	return addressSet;
}
public void setAddressSet(Set addressSet) {
	this.addressSet = addressSet;
}
public Map getAdressMap() {
	System.out.println("Map Elements  : " + adressMap);
	return adressMap;
}
public void setAdressMap(Map adressMap) {
	this.adressMap = adressMap;
}
public Properties getAddressProp() {
	System.out.println("Prop Elements  : " + addressProp);
	return addressProp;
}
public void setAddressProp(Properties addressProp) {
	this.addressProp = addressProp;
}

	
	
	
}
