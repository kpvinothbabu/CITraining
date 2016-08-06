package org.capgemini.dto;

public class Supplier {
	//instance variables
	private int supplierId;
	private String supplierName;
	private Address address;
	
	//No arg Constructor
	public Supplier(){}
	
	//Constructor with parameter
	public Supplier(int supplierId, String supplierName, Address address) {
		super();
		this.supplierId = supplierId;
		this.supplierName = supplierName;
		this.address = address;
	}
	
	//Getters and Setters
	public int getSupplierId() {
		return supplierId;
	}
	public void setSupplierId(int supplierId) {
		this.supplierId = supplierId;
	}
	public String getSupplierName() {
		return supplierName;
	}
	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Supplier [supplierId=" + supplierId + ", supplierName=" + supplierName + ", address=" + address + "]";
	}

}
