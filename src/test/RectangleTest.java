package test;

import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;
import utility.Rectangle;

public class RectangleTest {
	@Test
	public void testAreaIsPositiveWithSidesOfPositiveValue(){
		int length = 3;
		int breadth = 4;
		int expectedArea = 12;
		Rectangle rectangle = new Rectangle(length, breadth);
		
		int actualArea = rectangle.area();
		
		assertEquals(expectedArea, actualArea);
	}

	@Test
	public void testAreaIsNeutralWithSidesOfNeutralValue() {
		int length = 0;
		int breadth = 0;
		int expectedArea = 0;
		Rectangle rectangle = new Rectangle(length, breadth);
		
		int actualArea = rectangle.area();
		
		assertEquals(expectedArea, actualArea);
	}
	
	@Test
	public void testAreaIsNeutralWithSidesOfNegativeValue() {
		int length = -3;
		int breadth = 0;
		int expectedArea = 0;
		Rectangle rectangle = new Rectangle(length, breadth);
		
		int actualArea = rectangle.area();
		
		assertEquals(expectedArea, actualArea);
	}

	@Test
	public void testPerimeterIsPositiveWithSidesOfPositiveValue() {
		int length = 3;
		int breadth = 4;
		int expectedPerimeter = 14;
		Rectangle rectangle = new Rectangle(length, breadth);
		
		int actualPerimeter = rectangle.perimeter();
		
		assertEquals(expectedPerimeter, actualPerimeter);
	}

	@Test
	public void testPerimeterIsNeutralWithSidesOfNeutralValue() {
		int length = 0;
		int breadth = 0;
		int expectedArea = 0;
		Rectangle rectangle = new Rectangle(length, breadth);
		
		int actualArea = rectangle.perimeter();
		
		assertEquals(expectedArea, actualArea);
	}
	
	@Test
	public void testPerimeterIsNeutralWithSidesOfNegativeValue() {
		int length = -3;
		int breadth = 0;
		int expectedArea = 0;
		Rectangle rectangle = new Rectangle(length, breadth);
		
		int actualArea = rectangle.perimeter();
		
		assertEquals(expectedArea, actualArea);
	}
}
