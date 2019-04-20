class A
{
	static void Parent()
	{
	String s="Abc";
	System.out.println("Father's name:"+s);
	}
}
class B extends A
{
	static void Parent()
	{
	String x="abc";
	System.out.println("Child's name:"+x);
	}
}
class C extends B
{
	public static void main(String[] args)
	{
	A a=new A();
	B b=new B();
	A b1=new B();
	a.Parent();
	b.Parent();
	b1.Parent();

	}
}