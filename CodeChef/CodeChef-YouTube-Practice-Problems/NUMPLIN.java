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
		int temp = n;
		int answer = 0;
		while(n!=0){
		    int remainder = n%10;
		    answer = answer*10+remainder;
		    n/=10;
		}
		String s = (temp==answer)?"YES":"NO";
		System.out.println(s);
	}
}
