
public class Circle extends Shape {
   private double radius;
   public Circle() {
	   radius=0.0;
   }
   public Circle(double x , double y , double radius) {
	   super(x,y);
	   this.radius=radius;
   }
public double getRadius() {
	return radius;
}
public void setRadius(double radius) {
	this.radius = radius;
}
@Override
public void draw() {
	// TODO Auto-generated method stub
	super.draw();
	System.out.println("radius: "+radius);
}
   
}
