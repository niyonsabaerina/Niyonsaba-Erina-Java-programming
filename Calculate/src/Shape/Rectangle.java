package Shape;

public class Rectangle {
	private double length;
	private double width;
	//constructor
	
	public Rectangle(double length, double width) {
		super();
		this.length = length;
		this.width = width;
	}
	public double calArea(){
		return this.length*this.width;
	}
		public double calperimeter(){
			return (this.length+this.width)*2;



}
	
}