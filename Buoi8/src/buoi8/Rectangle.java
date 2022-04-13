package buoi8;

public class Rectangle {

	private int length;
	private int width;

	Rectangle() {

	}

	Rectangle(int length, int width) {
		this.length = length;
		this.width = width;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getArea() {
		return this.width * this.length;
	}

	public String toString() {
		return "Length = " + this.length + "; Width = " + this.width;
	}

	public static void display(Rectangle rectangle) {
		System.out.println(rectangle.toString());
		System.out.println("Area of rectangle is " + rectangle.getArea());
		System.out.println("====================");
	}

	public static void main(String[] args) {

		// contructor mac dinh
		Rectangle rectangle = new Rectangle();
		display(rectangle);

		// contructor 2 tham so
		Rectangle rectangle1 = new Rectangle(2, 9);
		display(rectangle1);

		// Getter, Setter
		Rectangle rectangle2 = new Rectangle();
		rectangle2.setLength(5);
		rectangle2.setWidth(10);
		display(rectangle2);

	}

}
