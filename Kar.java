class MotorVehicle
{
	String modelname;
	String modelno;
	int modelprice;
	MotorVehicle()
	{
	modelname="Mercedies";
	modelno="ndiu672";
	modelprice=2500000;

	}
	public void display()
	{
	System.out.println("model name="+modelname);
	System.out.println("model no="+modelno);
	System.out.println("model price="+modelprice);
	}
}
class Car extends MotorVehicle
{ 1
	int discountrate;
	int currentprice;
	Car()
	{
	  discountrate=10;
	}
	public void discount()
	{
	if(modelprice>500)
	{
      currentprice=(((100-discountrate)*modelprice)/100);
	}

	}
	
	public void display()
	{
	super.display();
	discount();
	System.out.println("discount rate"+discountrate);
	System.out.println("current price"+currentprice);
	}
}
public class Kar
{
	public static void main(String args[])
	{
       Car c=new Car();
       c.display();
	}
}
