package org.capgemini.test;

import static org.junit.Assert.*;

import org.capgemini.dao.ProductDao;
import org.capgemini.dto.Product;
import org.capgemini.exception.InvalidProductQuantityException;
import org.capgemini.service.ProductService;
import org.capgemini.service.ProductServiceImpl;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

public class ProductAppTestCase {
	
	private ProductService productService;
	
	@Mock
	private ProductDao productDao;
	
	@Before
	public void beforeMethod(){
		//productService=new ProductServiceImpl();
		MockitoAnnotations.initMocks(this);
		productService=new ProductServiceImpl(productDao);
	}
	
	@Test
	public void test_calculatePrice_method(){
		assertEquals(500.00,productService.calculatePrice(5, 100.0), 0.0001);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void when_createProduct_with_nullValue() throws InvalidProductQuantityException{
		Product product=null;
		productService.createProduct(product);
	}
	
	@Test(expected=InvalidProductQuantityException.class)
	public void when_createProduct_with_invalid_Quantity() throws InvalidProductQuantityException{
		Product product=new Product();
		product.setProductId(1001);
		product.setProductName("XYZ Product");
		product.setPrice(100);
		product.setQuantity(0);
		
		productService.createProduct(product);
	}
	

	@Test
	public void when_create_product_with_dao_dependency(){
		Product product=new Product();
		product.setProductId(1001);
		product.setProductName("XYZ Product");
		product.setPrice(100);
		product.setQuantity(5);
		
		//Declaration
		Mockito.when(productDao.findProduct(1001)).thenReturn(product);
		
		//Invoke real dependency Object
		Product find_product= productService.findProduct(1001);
		
		//Verification
		Mockito.verify(productDao).findProduct(1001);
		
	}
	
	@Test
	public void when_consume_with_dao_dependency() throws InvalidProductQuantityException{
		Product product=new Product();
		product.setProductId(1001);
		product.setProductName("XYZ Product");
		product.setPrice(100);
		product.setQuantity(5);
		
		//Declaration
				Mockito.when(productDao.findProduct(1001)).thenReturn(product);
				
				//Invoke real dependency Object
				Product updated_product= productService.consumeProduct(1001, 2);
				
				//Verification
				Mockito.verify(productDao).findProduct(1001);
				
				assertEquals(3, updated_product.getQuantity());
	}
	
	
	//Fill the method with proper test case conditions,
	//when produce product using mock object
	@Test
	public void when_produce_with_dao_dependency() throws InvalidProductQuantityException{
		
	}
	
	
}
