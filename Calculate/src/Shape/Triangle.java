package Shape;

public class Triangle {
	private double base;
	private double height;
	private double hypothenus;
	public Triangle(double base, double height) {
		super();
		this.base = base;
		this.height = height;
		double result =(base*base) +(height*height);
		this.hypothenus =Math.sqrt(result);
		
		public double calArea(){
		return (this.base*this.height)/2;
		}
		public double calperimeter(){
		return this.base+this.height+this.height;
		
	}

}
