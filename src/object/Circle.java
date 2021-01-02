package object;

public class Circle {
	double center;
	double radius;

	Circle() {
	}

	Circle(double Center, double Radius) {
		this.center = Center;
		this.radius = Radius;
	}

	double getPerimeter() {
		return 2 * Math.PI * this.radius;
	}

	double getArea() {
		return Math.PI * this.radius * this.radius;
	}

	void setCenter(double center) {
		this.center = center;
	}

	void SetRadius(double radius) {
		this.radius = radius;
	}
}
