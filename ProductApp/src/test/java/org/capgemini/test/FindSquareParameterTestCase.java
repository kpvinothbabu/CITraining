package org.capgemini.test;

import java.util.Arrays;
import java.util.Collection;

import org.capgemini.service.ProductService;
import org.capgemini.service.ProductServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import junit.framework.Assert;

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
	
	@Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {     
                 { 0, 0 }, { 1, 1 }, { 2, 4 }, { 3, 9 }, { 4, 16}  
           });
    }
	
	
	
	
	
	@Test
	public void test_findSquare_Method(){
		//Add your test logic here
		Assert.assertEquals(expected, productService.findSquare(input) );
	}
	
	
	
	
}
