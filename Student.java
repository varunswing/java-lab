class Student
{
	String name;
	int age;
	String add;
	Student()
	{
		name="unknown";
		age=0;
		add="not available";
	}

	void setInfo(String n,int a)
	{
	 	System.out.println("name="+n+"\tage="+a);
	}

	void setInfo(String ad)
	{
	 	System.out.print("address="+ad);
	}

	public static void main(String[] args)
	{
		Student s[]=new Student[5];
		System.out.println("First Student detail:");
		s[0]=new Student();
		s[0].setInfo("Varun",18);
		s[0].setInfo("Patna");

		System.out.println("Second Student detail:");
		s[1]=new Student();
		s[1].setInfo("Shreya",18);
		s[1].setInfo("Patna");

		System.out.println("Third Student detail:");
		s[2]=new Student();
		s[2].setInfo("Abhishek",18);
		s[2].setInfo("Gaya");

		System.out.println("Fourth Student detail:");
		s[3]=new Student();
		s[3].setInfo("Shubham",18);
		s[3].setInfo("Gaya");

		System.out.println("Fifth Student detail:");
		s[4]=new Student();
		s[4].setInfo("Aryan",18);
		s[4].setInfo("Gaya");
	}
}