package test;

import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;
import utility.Rectangle;

public class RectangleTest {
	@Test
	public void testFindArea()
	{
		//First case which takes positive value
		int length=3;
		int breadth=4;
		int expectedArea=12;
		Rectangle rectangle1=new Rectangle(length,breadth);
		int actualArea=rectangle1.findArea();
		assertEquals(expectedArea, actualArea);
		
		//Second case which takes neutral value
		length=0;
		breadth=0;
		expectedArea=0;
		Rectangle rectangle2=new Rectangle(length,breadth);
		actualArea=rectangle2.findArea();
		assertEquals(expectedArea, actualArea);
	}
	
	@Test
	public void testFindPerimeter()
	{
		//First case which takes positive value
		int length=3;
		int breadth=4;
		int expectedPerimeter=14;
		Rectangle rectangle1=new Rectangle(length,breadth);
		int actualPerimeter=rectangle1.findPerimeter();
		assertEquals(expectedPerimeter, actualPerimeter);
		
		//Second case which takes neutral value
		length=0;
		breadth=0;
		expectedPerimeter=0;
		Rectangle rectangle2=new Rectangle(length,breadth);
		actualPerimeter=rectangle2.findPerimeter();
		assertEquals(expectedPerimeter, actualPerimeter);
	}
}
