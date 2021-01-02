
package object;

public class Main {

	public static void main(String[] args) {
		Circle c1 = new Circle(1, 3);
		Circle c2 = new Circle(5, 6);

		System.out.println(c1.getArea());
		System.out.println(c1.getPerimeter());
		System.out.println();
		c1.radius = 1;
		c2.radius = 3;
		System.out.println(c1.getArea());
		System.out.println(c1.getPerimeter());
	}

}
