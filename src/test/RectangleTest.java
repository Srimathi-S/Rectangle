package test;

import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;
import utility.Rectangle;

public class RectangleTest {
	@Test
	public void testFindArea()
	{
		//First case which returns 12
		int length=3;
		int breadth=4;
		int expectedArea=12;
		Rectangle rectangle1=new Rectangle(length,breadth);
		int actualArea=rectangle1.findArea();
		assertEquals(expectedArea, actualArea);
		//Second case which returns 0
		length=0;
		breadth=0;
		expectedArea=0;
		Rectangle rectangle2=new Rectangle(length,breadth);
		actualArea=rectangle2.findArea();
		assertEquals(expectedArea, actualArea);
	}
}
