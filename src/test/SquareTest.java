package test;

import exception.InvalidSidesException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import utility.Square;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class SquareTest {

    @Test
    public void generatesErrorWhileCreatingSquareWithNegativeSides(){
        int side = -3;
        String expectedMessage="Sides do not support negative and zero value";

        Exception exception=assertThrows(InvalidSidesException.class, ()-> new Square(side));
        String actualMessage=exception.getMessage();

        Assertions.assertEquals(expectedMessage,actualMessage);
    }

    @Test
    public void generatesErrorWhileCreatingSquareWithNeutralSides(){
        int side = 0;
        String expectedMessage="Sides do not support negative and zero value";

        Exception exception=assertThrows(InvalidSidesException.class, ()-> new Square(side));
        String actualMessage=exception.getMessage();

        Assertions.assertEquals(expectedMessage,actualMessage);
    }

    @Test
    public void generatesSquareWhileCreatingSquareWithPositiveSides() throws InvalidSidesException {
        int side=4;

        Square square=new Square(side);

        Assertions.assertTrue(square instanceof Square);
    }

    @Test
    public void testAreaIsPositiveWithSidesOfPositiveValue() throws InvalidSidesException {
        int side = 3;
        int expectedArea = 9;
        Square square = new Square(side);

        int actualArea = square.area();

        Assertions.assertEquals(expectedArea, actualArea);
    }

    @Test
    public void testPerimeterIsPositiveWithSidesOfPositiveValue() throws InvalidSidesException {
        int side = 3;
        int expectedPerimeter =12 ;
        Square square = new Square(side);

        int actualPerimeter = square.perimeter();

        Assertions.assertEquals(expectedPerimeter, actualPerimeter);
    }

}
