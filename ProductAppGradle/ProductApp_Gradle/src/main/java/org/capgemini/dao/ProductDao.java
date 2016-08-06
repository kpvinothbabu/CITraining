package org.capgemini.dao;

import org.capgemini.dto.Product;

public interface ProductDao {
	public boolean addProduct(Product product);
	public Product findProduct(int productId);
}
