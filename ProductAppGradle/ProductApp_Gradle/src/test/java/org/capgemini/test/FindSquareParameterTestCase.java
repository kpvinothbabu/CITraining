package org.capgemini.test;

import org.capgemini.service.ProductService;
import org.capgemini.service.ProductServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class FindSquareParameterTestCase {
	
	private ProductService productService=new ProductServiceImpl();

	private int input;
	private int expected;
	
	public FindSquareParameterTestCase(int input, int expected) {
		super();
		this.input = input;
		this.expected = expected;
	}
	
	//Add method which carries all the parameters.
	//Create a method with set of inputs and expected output.
	
	
	
	
	
	@Test
	public void test_findSquare_Method(){
		//Add your test logic here
	}
	
	
	
	
}
