
public class Shape {
     private double x;
     private double y;
     
     public Shape() {
    	 x=0.0;
    	 y=0.0;
     }
     public Shape(double x,double y) {
    	 this.x=x;
    	 this.y=y;
     }
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
	public void draw() {
		System.out.println("x: "+x+", y: "+y);
	}
     
}
