public class Circle2D {
    private double x;
    private double y;
    private double radius; 
    public Circle2D(){
        this.x=0;
        this.y=0;
        this.radius=1;
    }
    public Circle2D(double x,double y,double radius){
        this.x=x;
        this.y=y;
        this.radius=radius;
    }
    public double getx(){return x;}
    public double gety(){return y;}
    public double getradius(){return radius;}
    public double getArea()
	{
		double area;
		area = Math.PI * Math.pow(this.radius, 2);
		return area;
	}
	public double getPerimeter()
	{
		double perimeter;
		perimeter = 2 * Math.PI *this.radius; 
		return perimeter;
    }

}
