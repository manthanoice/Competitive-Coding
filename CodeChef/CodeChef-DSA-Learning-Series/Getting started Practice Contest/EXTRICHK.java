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
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		if(a+b>c&&b+c>a&&a+c>b){
    		if(a==b&&b==c)
    		    System.out.println("1");
    		else if(a==b||b==c||a==c)
    		    System.out.println("2");
    		else if(a!=b||b!=c||a!=c)
    		    System.out.println("3");
		}
		else
		    System.out.println("-1");
	}
}
