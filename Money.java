class Money
{
	int rupee[]=new int[2];
	int paisa[]=new int[2];
	Money()
	{
	rupee[0]=16;
	paisa[0]=56;
	rupee[1]=35;
	paisa[1]=46;
	}
	
   float add()
   {
     float c=paisa[0]+paisa[1];
     int d=rupee[0]+rupee[1];
     if(c>100)
     {
       c=c%100;
       d++;
     }
     c=c/100;
     float e=d+c;
     return e;

   }
   float subst()
   {
       float c=paisa[1]-paisa[0];
        if (c<0)
        {
        c=c+100;
        rupee[1]--;
        }
        int d=rupee[1]-rupee[0];
        c=c/100;
        float e=d+c;
        return e;

   }
   public static void main(String[] args)
   {
     Money m=new Money();
     float g=m.add();
     System.out.println("sum of two amount="+g);
     float h=m.subst();
     System.out.println("difference of two amount="+h);

   }

}
	
