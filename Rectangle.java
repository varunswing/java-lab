import java.util.Scanner;
class Rectangle
{
	float length=0;
	float breadth=0;
	void set()
	{
      if(length<0.0||length>20.0)
      {
      length=0;
      }
      if(breadth<0.0||breadth>20.0)
      {
      breadth=0;
      }
    } 
    void get()
    {
      Scanner s=new Scanner(System.in);
      System.out.println("ENTER LENGTH");
      float l=s.nextFloat();
      System.out.println("ENTER BREADTH");
      float b=s.nextFloat();
      length=l;
      breadth=b;
      set();
    }
    public static void main(String[] args)
    {
      Rectangle r=new Rectangle();
      r.get();
      double a=(r.length*r.breadth);
      double p=2*(r.length+r.breadth);
      System.out.println("area="+a);
      if(r.length==0||r.breadth==0)
      {
      p=0;
      }
      System.out.println("perimetre="+p);
      
    }
	

}