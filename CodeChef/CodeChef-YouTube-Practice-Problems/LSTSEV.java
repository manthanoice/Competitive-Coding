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
		int n = sc.nextInt();
		n/=10; //n=n/10-->Removes the last digit
		n%=10; //n=n%10-->Gives the last digit aka the second last because we have removed last digit already
		String s = (n==7)?"1":"0";
		System.out.println(s);
	}
}
