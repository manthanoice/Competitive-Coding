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
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
		    int a = sc.nextInt();
		    int b = sc.nextInt();
		    if(a+b<3)
		        System.out.println("1");
		    else if(a+b>=3&&a+b<=10)
		        System.out.println("2");
		    else if(a+b>=11&&a+b<=60)
		        System.out.println("3");
		    else if(a+b>60)
		        System.out.println("4");
		}
	}
}
