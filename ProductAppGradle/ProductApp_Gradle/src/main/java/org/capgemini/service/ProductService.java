package org.capgemini.service;

import org.capgemini.dto.Product;
import org.capgemini.exception.InvalidProductQuantityException;

public interface ProductService {
	public Product createProduct(Product product) throws InvalidProductQuantityException;
	public Product findProduct(int productId);
	public Product consumeProduct(int productId,int quanity)throws InvalidProductQuantityException;
	public Product produceProduct(int productId,int quanity)throws InvalidProductQuantityException;
	public double calculatePrice(int qty,double price);
}
