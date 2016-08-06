package org.capgemini.service;

import org.capgemini.dao.ProductDao;
import org.capgemini.dao.ProductDaoImpl;
import org.capgemini.dto.Product;
import org.capgemini.exception.InvalidProductQuantityException;
import org.capgemini.util.ProductUtility;

public class ProductServiceImpl implements ProductService{
	
	private ProductDao productDao;
	
	//no arg constructor
	public ProductServiceImpl(){
		productDao=new ProductDaoImpl();
	}
	
	//overloaded Constructor
	public ProductServiceImpl(ProductDao productDao){
		this.productDao=productDao;
	}

	@Override
	public Product createProduct(Product product) throws InvalidProductQuantityException {
		if(product==null)
			throw new IllegalArgumentException();
		if(product.getQuantity()<=0)
			throw new InvalidProductQuantityException();
		
		product.setProductId(ProductUtility.generateProductId());
		
		if(productDao.addProduct(product))
		{
			return product;
		}
		
		return null;
	}

	@Override
	public Product findProduct(int productId) {
		
		return productDao.findProduct(productId);
	}

	@Override
	public Product consumeProduct(int productId, int quanity) throws InvalidProductQuantityException {
		
		Product find_product=findProduct(productId);
		
		if(find_product==null){
			throw new NullPointerException();
		}
		if(find_product.getQuantity()<quanity){
			throw new InvalidProductQuantityException();
		}
		find_product.setQuantity(find_product.getQuantity()-quanity);
		return find_product;
		
		}

	@Override
	public Product produceProduct(int productId, int quanity) throws InvalidProductQuantityException {
		Product find_product=findProduct(productId);
		
		if(find_product==null){
			throw new NullPointerException();
		}
		if(find_product.getQuantity()<0){
			throw new InvalidProductQuantityException();
		}
			find_product.setQuantity(find_product.getQuantity()+quanity);
			return find_product;
	}
	
	@Override
	public double calculatePrice(int qty, double price) {
		
		return qty*price;
	}

}
