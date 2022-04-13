package buoi8;

public class Circle {
	private double radius;
	private String color;

	Circle() {
		this.radius = 1.0;
		this.color = "red";
	}

	Circle(double radius) {
		this.radius = radius;
		this.color = "red";
	}

	Circle(double radius, String color) {
		this.radius = radius;
		this.color = color;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getArea() {

		return 4 * Math.PI * this.radius * this.radius;
	}

	public String toString() {
		return "Radius =  " + this.radius + " ; Color =  " + this.color;
	}

	public static void display(Circle circle) {
		System.out.println(circle.toString());
		System.out.println("Area of circle is " + circle.getArea());
		System.out.println("=========================");
	}

	public static void main(String[] args) {

		// contructor mac dinh
		Circle circle = new Circle();
		display(circle);

		// contructor 1 tham so
		Circle circle1 = new Circle(3.0);
		display(circle1);

		// contructor 2 tham so
		Circle circle2 = new Circle(2.0, "black");
		display(circle2);

		// Getter, setter
		Circle circle3 = new Circle();
		circle3.setRadius(4.0);
		circle3.setColor("pink");
		display(circle3);
	}

}
