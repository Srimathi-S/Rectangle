package utility;

public class Rectangle {
	private int length;
	private int breadth;
	
	public Rectangle(int length, int breadth) {
		this.length=length;
		this.breadth=breadth;
	}
	
	public int area() {
		if(length<=0 &&breadth<=0)return 0;
		return length*breadth;
	}
	
	public int perimeter() {
		if(length<=0 &&breadth<=0)return 0;
		return 2*(length+breadth);
	}
}
