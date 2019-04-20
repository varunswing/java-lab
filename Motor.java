import java.util.*;

interface Vehicle
{
    int changeGear();
    int speedUp(int a);
    int applyBrakes(int b);
}
class Car implements Vehicle
{
    int gear=0;
    int speed=0;
    public int changeGear()
    {
        System.out.println("Enter the gear of the car");
        Scanner sc=new Scanner(System.in);
        gear=sc.nextInt();
        if(gear>4)
        {
            gear=0;
        }
        switch(gear)
        {
            case 1:
            speed=10;
            break;
            case 2:
            speed=20;
            break;
            case 3:
            speed=30;
            break;
            case 4:
            speed=40;
            break;
        }
        return speed;
    }
    public int speedUp(int x)
    {
        int s1=0;
        System.out.println("By how much u want to increase speed of a Car: ");
        Scanner s=new Scanner(System.in);
        s1=s.nextInt();
        if(s1>10)
        {
            s1=0;
        }
        x=x+s1;
        return x;

    }
    public int applyBrakes(int y)
    {
    System.out.println("By how much u want to decrease speed of a Car: ");
      Scanner sca=new Scanner(System.in);
      int s2=sca.nextInt();
      if(s2>10)
      {
      s2=0;
      }
      y=y-s2;
      return y;
    }
}
class Truck implements Vehicle
{
    int gear=0;
    int speed=0;
    public int changeGear()
    {
        System.out.println("Enter the gear of the truck2");
        Scanner sc=new Scanner(System.in);
        gear=sc.nextInt();
        if(gear>5)
        {
            gear=0;
        }
        switch(gear)
        {
            case 1:
            speed=10;
            break;
            case 2:
            speed=20;
            break;
            case 3:
            speed=30;
            break;
            case 4:
            speed=40;
            break;
            case 5:
            speed=50;
            break;
        }
        return speed;
    }
    public int speedUp(int x)
    {
        int s1=0;
        System.out.println("By how much u want to increase speed of a truck: ");
        Scanner s=new Scanner(System.in);
        s1=s.nextInt();
        if(s1>10)
        {
            s1=0;
        }
        x=x+s1;
        return x;

    }
    public int applyBrakes(int y)
    {
    System.out.println("By how much u want to decrease speed of a truck: ");
      Scanner sca=new Scanner(System.in);
      int s2=sca.nextInt();
      if(s2>10)
      {
      s2=0;
      }
      y=y-s2/2;
      return y;
    }
}
public class Motor
{
    public static void main(String[] args)
    {
        Car c=new Car();
        int a=c.changeGear();
        int b=c.speedUp(a);
        int d=c.applyBrakes(b);
        System.out.println("Current Speed="+d);
        Truck i=new Truck();
        int e=i.changeGear();
        int f=i.speedUp(a);
        int g=i.applyBrakes(b);
         System.out.println("Current Speed="+g);
    }
}