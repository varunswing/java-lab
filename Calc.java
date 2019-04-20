abstract class Account
{
	int bala;
	long acc_no;
	String name;
	String add;
	Account(){
	bala=800;
	acc_no=1245678;
	name="Varun Sharma";
	add="Sone-A,NIT,PATNA";

	}
	abstract int withdrawal();
	abstract int deposit();
	abstract void display();

}
class SavingAccount extends Account
{
	int rate=2;
	
     int withdrawal()
     {
       bala=bala-500;
       System.out.println("WITHDRAWN Rs.500");
       return bala;
     }
	 int deposit()
	 {
      bala=bala+600;
      System.out.println("DEPOSITED Rs.600");
      return bala;
	 }
	int amount()
	{ 
	int c;
      bala=withdrawal();
      bala=deposit();
      c=((bala*(100+rate))/100);
      return c;
	}
	void display()
	{
	System.out.println("accont holder name="+name+"\naccount no="+acc_no+"\naddress="+add+"\nbalance="+bala);
	int d=amount();
	System.out.println("rate of interest="+rate); 
	System.out.println("current balance"+d);
	}
}
class CurrentAccount extends Account
{
	int over_draft_limit=5000;
	int withdrawal()
     {
       bala=bala-400;
       System.out.println("WITHDRAWN Rs.400");
       return bala;
     }
	 int deposit()
	 {
      bala=bala+800;
      System.out.println("DEPOSITED Rs.800");
      return bala;
	 }

	void display()
	{
     System.out.println("accont holder name="+name+"\naccount no="+acc_no+"\naddress="+add+"\nbalance="+bala);
     System.out.println("over draft limit="+over_draft_limit);
     bala=withdrawal();
     bala=deposit();
     System.out.println("current balance"+bala);
	}
}
class Calc
{
	public static void main(String[] args)
	{
      SavingAccount s=new SavingAccount();
      s.display();
      CurrentAccount c=new CurrentAccount();
      c.display();
	}
}