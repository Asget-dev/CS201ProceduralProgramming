package arrayListDeclaration;

public class Rectangle {
	private double width;
	private double height;

	public Rectangle() {
		this.width = 1.0;
		this.height = 1.0;
	}

	public Rectangle(double w, double h) {
		this.width = w;
		this.height = h;
	}

	public double getArea() {
		return this.width * this.height;
	}

	public double getParameter() {
		return this.width + this.height;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

}
