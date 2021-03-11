package utility;

import exception.InvalidSidesException;

public class Square extends Rectangle{

    public Square(int side) throws InvalidSidesException {
        super(side,side);
    }
}
