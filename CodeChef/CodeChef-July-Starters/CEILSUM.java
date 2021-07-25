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
		    double a = sc.nextDouble();
		    double b = sc.nextDouble();
		    double x = (a+b)/2;
		    double answer;
		    if(a==b)
		        answer = 0;
		    else if (a>b)
		        answer = ((Math.ceil(b-(a-1))/2)+Math.ceil(((a-1)-a)/2));
		    else
		        answer = ((Math.ceil(b-(a+1))/2)+Math.ceil(((a+1)-a)/2));
		    System.out.println(Math.round(answer));
		}
	}
}
