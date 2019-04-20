/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		try 
		{
		    Scanner sc=new Scanner(System.in);
    		int n=sc.nextInt();
    		long p=1l;
    		String s="31415926535897932384626433832795028841971";
            for(int x=0;x<n;x++)
    		{
    		    p=p*((int)s.charAt(x)-48);
    		}
    	    System.out.println(p);  	
    
		} 
		catch(Exception e)
		{
		}
		finally 
		{
		}
	}
}
