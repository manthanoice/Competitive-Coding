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
		double A = sc.nextDouble();
		double B = sc.nextDouble();
		char c = sc.next().charAt(0);
		double sum4=0;
		double sum1 = A+B;
		double sum2 = A-B;
		double sum3 = A*B;
        if(B!=0){
            sum4 = A/B;
        }
		switch(c){
		    case '+': System.out.println(sum1); break;
		    case '-': System.out.println(sum2); break;
		    case '*': System.out.println(sum3); break;
		    case '/': System.out.println(sum4); break;
		}
	}
}
