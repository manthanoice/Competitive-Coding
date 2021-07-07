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
		int []n = new int[t];
		for(int i=0; i<t; i++){
		    n[i]=sc.nextInt();
		}
		Arrays.sort(n);
		for(int j=0; j<t; j++){
		    System.out.println(n[j]);
		}
	}
}
