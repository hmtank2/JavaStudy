package workshop07.shape;

import java.util.ArrayList;

public class ShapeTest {
	public static void main(String[] args) {
		ArrayList<Shape> list = new ArrayList<Shape>();
		list.add(new Rectangle(4,7,5));
		list.add(new Rectangle(5,4,6));
		list.add(new Circle(6,6,7));
		list.add(new Circle(7,8,3));
		
		for (Shape shape : list) {
			System.out.println(shape);
		}
		System.out.println("");
		for (Shape shape : list) {
			if(shape instanceof Rectangle) {
				((Rectangle)shape).move(10, 10);
			}
			if(shape instanceof Circle) {
				((Circle)shape).move(10, 10);
			}
			System.out.println(shape);
		}
	}
}
