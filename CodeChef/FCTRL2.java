/* package codechef; // don't place package name! */
//One thing to remember while writing this code is that you're supposed to use BigInteger class of math package, otherwise it'll show it's wrong, even if your whole code is right

import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
		    int n = sc.nextInt();
		    BigInteger sum = BigInteger.ONE;
		    for(int j=1; j<=n; j++){
		        sum=sum.multiply(new BigInteger(j+""));
		    }
		    System.out.println(sum);
		}
	}
}
