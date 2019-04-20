import java.util.*;
class ReverseString{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		int x=str.length();
		char a[]=str.toCharArray();
		char ch[]=new char[x];
		for (int i=0;i<x ;i++ ) {
			ch[i]=a[x-i-1];
		}
		System.out.println(ch);
		int count=0;
		for (int i=0;i<x ;i++ ) {
			if(a[i]==ch[i])
			{
				count++;
			}
		}
		if (count==x) {
			System.out.println("Palindrome");
		}
		else
			System.out.println("Not Palindrome");
	}
}