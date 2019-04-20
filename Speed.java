 import java.util.Scanner;
 interface Vehicle
 {  
    int changeGear();
    int stepUp(int b);
    int applyBreaker(int a);
 }
 class Car implements Vehicle
 {  
    int gear=0;
    int speed=0;
    public int changeGear()
    {
      System.out.println("Enter the gear");
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
    public int stepUp(int x)
    {
       int s1=0;
      System.out.println("How much u want to increase speed(in Kmph):");
      Scanner s=new Scanner(System.in);
      s1=s.nextInt();
      if(s1>10)
      {
      s1=0;
      }
      x=x+s1;
      return x;

    }
    public int applyBreaker(int y)
    {
    System.out.println("How much u want to decrease speed(in Kmph):");
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
 class Speed
  {
    public static void main(String[] args)
    {
      System.out.println("CAR:");
      Car c=new Car();
      int a=c.changeGear();
      int b=c.stepUp(a);
      int d=c.applyBreaker(b);
      System.out.println("Current Speed(in Kmph)="+d);
      System.out.println("TRUCK:");
      Car p=new Car();
      int q=p.changeGear();
      int r=p.stepUp(q);
      int s=p.applyBreaker(r);
      System.out.println("Current Speed(in Kmph)="+s);
    }
 }