package workshop07.shape;

public class Circle extends Shape implements Movable {

	private int radius;
	
	@Override
	public double getArea() {
		
		return 3.14*Math.pow(this.radius, 2);
	}

	@Override
	public double getCircumference() {
		return 2*this.radius*3.14;
	}

	@Override
	public void move(int x, int y) {
		this.point.setX(this.point.getX()+x+1);
		this.point.setY(this.point.getY()+y+1);
		
	}

	public Circle() {
		
	}

	public Circle(int radius, int x, int y) {
		//this.point.setX(x);
		//this.point.setY(y);
		this.point = new Point(x, y);
		this.setRadius(radius); 
		
	}
	
	
	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", Xpoint=" + point.getX()+" ,Ypoint="+point.getY() + ", getArea()=" + getArea() + ", getCircumference()="
				+ getCircumference() + "]";
	}
	
	
	
}
