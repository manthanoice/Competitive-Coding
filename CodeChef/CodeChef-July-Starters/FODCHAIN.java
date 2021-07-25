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
		    int e = sc.nextInt();
		    int k = sc.nextInt();
		    int count = 0;
		    while(e>0){
		        e = (int)Math.floor(e/k);
		        count++;
		    }
		    System.out.println(count);
		}
	}
}
