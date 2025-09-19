package Shape;

public class Circle {

	private double radius;

	public Circle(double radius) {
		super();
		this.radius = radius;
	}
		
		public double calArea(){
			return Math.PI*radius*radius;
			}

		public double calperimeter(){
			return 2*Math.PI*radius;

		}

	}




