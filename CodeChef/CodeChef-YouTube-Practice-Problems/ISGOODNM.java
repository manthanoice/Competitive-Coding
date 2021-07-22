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
		double n = sc.nextLong();
		double sum=1;
		for(int i=2; i<=Math.sqrt(n); i++){ //Bruh if it doesn't work now I will die ig
		    if(n%i==0){
		        if(i*i!=n)
		            sum = sum + i + n / i;
		        else
		            sum+= i;
		    }
		}
		String s = (sum==n&&n!=1)?"YES":"NO";
		System.out.println(s);
	}
}
