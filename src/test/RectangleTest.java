package test;
import exception.InvalidSidesException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import utility.Rectangle;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class RectangleTest {

	@Test
	public void generatesErrorWhileCreatingRectangleWithNegativeSides(){
		int length = -3;
		int breadth = -4;
		String expectedMessage="Sides do not support negative and zero value";

		Exception exception=assertThrows(InvalidSidesException.class, ()-> new Rectangle(length, breadth));
		String actualMessage=exception.getMessage();

		Assertions.assertEquals(expectedMessage,actualMessage);
	}

	@Test
	public void generatesErrorWhileCreatingRectangleWithNeutralSides(){
		int length = 0;
		int breadth = 4;
		String expectedMessage="Sides do not support negative and zero value";

		Exception exception=assertThrows(InvalidSidesException.class, ()-> new Rectangle(length, breadth));
		String actualMessage=exception.getMessage();

		Assertions.assertEquals(expectedMessage,actualMessage);
	}

	@Test
	public void generatesRectangleWhileCreatingRectangleWithPositiveSides() throws InvalidSidesException {
		int length = 6;
		int breadth = 4;

		Rectangle rectangle=new Rectangle(length, breadth);

		Assertions.assertTrue(rectangle instanceof Rectangle);
	}

	@Test
	public void testAreaIsPositiveWithSidesOfPositiveValue() throws InvalidSidesException {
		int length = 3;
		int breadth = 4;
		int expectedArea = 12;
		Rectangle rectangle = new Rectangle(length, breadth);
		
		int actualArea = rectangle.area();
		
		Assertions.assertEquals(expectedArea, actualArea);
	}

	@Test
	public void testPerimeterIsPositiveWithSidesOfPositiveValue() throws InvalidSidesException {
		int length = 3;
		int breadth = 4;
		int expectedPerimeter = 14;
		Rectangle rectangle = new Rectangle(length, breadth);

		int actualPerimeter = rectangle.perimeter();

		Assertions.assertEquals(expectedPerimeter, actualPerimeter);
	}

}
