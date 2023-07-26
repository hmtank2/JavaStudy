package workshop07.shape;

public class Rectangle extends Shape implements Movable {

	private int width;
	@Override
	public double getArea() {
		
		return Math.pow(this.width, 2);
	}

	@Override
	public double getCircumference() {
		// TODO Auto-generated method stub
		return this.width*4;
	}

	@Override
	public void move(int x, int y) {
		this.point.setX(this.point.getX()+x+2);
		this.point.setY(this.point.getY()+y+2);

	}

	public Rectangle( int width, int x, int y) {
		//this.point.setX(x);
		//this.point.setY(y);
		this.point = new Point(x, y);
		this.width = width;
	}

	public Rectangle(Point point) {
		super(point);
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", Xpoint=" + this.point.getX() + ", Ypoint="+this.point.getY()+ ", getArea()=" + getArea() + ", getCircumference()="
				+ getCircumference() + "]";
	}
	
	
	
}
