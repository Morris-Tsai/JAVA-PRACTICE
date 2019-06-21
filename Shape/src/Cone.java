
public class Cone extends Circle {
    private double x2;
    private double x3;
    private double y2;
    private double y3;
    
    public Cone() {
    	x2=0.0;
    	x3=0.0;
    	y2=0.0;
    	y3=0.0;
    }
    public Cone(double x,double y,double radius,double x2,double x3,double y2,double y3) {
    	super();
    	this.x2=x2;
    	this.x3=x3;
    	this.y2=y2;
    	this.y3=y3;
    }
	public double getX2() {
		return x2;
	}
	public void setX2(double x2) {
		this.x2 = x2;
	}
	public double getX3() {
		return x3;
	}
	public void setX3(double x3) {
		this.x3 = x3;
	}
	public double getY2() {
		return y2;
	}
	public void setY2(double y2) {
		this.y2 = y2;
	}
	public double getY3() {
		return y3;
	}
	public void setY3(double y3) {
		this.y3 = y3;
	}
	@Override
	public void draw() {
		// TODO Auto-generated method stub
		super.draw();
		System.out.println(" x2: "+x2+", x3: "+x3+" , y2: "+y2+", y3: "+y3);
	}
    
}
