package utility;

import exception.InvalidSidesException;

public class Rectangle {
	private int length;
	private int breadth;
	
	public Rectangle(int length, int breadth) throws InvalidSidesException {
		if(length<=0 || breadth<=0) throw new InvalidSidesException();
		this.length=length;
		this.breadth=breadth;
	}
	
	public int area() {
		return length*breadth;
	}
	
	public int perimeter() {
		return 2*(length+breadth);
	}
}
