package org.capgemini.dto;

public class Product {
	
	//instance variables
	private int productId;
	private String productName;
	private Supplier supplier;
	private int quantity;
	private double price;
	
	//No arg Constructor
	public Product(){}
	
	//Constructor with parameter
	public Product(int productId, String productName, Supplier supplier, int quantity, double price) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.supplier = supplier;
		this.quantity = quantity;
		this.price = price;
	}
	
	//Getters and Setters
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public Supplier getSupplier() {
		return supplier;
	}
	public void setSupplier(Supplier supplier) {
		this.supplier = supplier;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", supplier=" + supplier
				+ ", quantity=" + quantity + ", price=" + price + "]";
	}
	
	

}
