abstract class GeometricObject
{
	String color;
	double weight;
	GeometricObject()
	{
	color="white";
	weight=1.0;
	}
	String getColor()
	{color="red"; 
	 return color;}
	 double getWeight()
	{weight=10.0;
	 return weight;}
    
	abstract double findArea();
	abstract double findPerimeter();
	
}
class Triangle extends GeometricObject
{
double s1=5.0,s2=6.0,s3=7.0;


double findPerimeter()
{
	double peri=s1+s2+s3;
	return peri;
}
double findArea()
{
	double d=(s1+s2+s3)/2;
    double e=d*(d-s1)*(d-s2)*(d-s3);
    double a=Math.sqrt(e);
    return a;
}
}
class Action
{
   public static void main(String[] args)
   {
	Triangle t=new Triangle();
	
	double y=t.findPerimeter();
	double z=t.findArea();
	System.out.println("colour="+t.getColor()+"\nweight"+t.getWeight()+"\nperimeter="+y+"\narea="+z);
	}
}
