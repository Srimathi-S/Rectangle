package utility;

public class Rectangle {
	private int length;
	private int breadth;
	public Rectangle(int length, int breadth) {
		this.length=length;
		this.breadth=breadth;
	}
	public int findArea() {
		return length*breadth;
	}
	public int findPerimeter() {
		return 2*(length+breadth);
	}
}
