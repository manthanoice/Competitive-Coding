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
		int a [] = new int[n];
		for(int i=0; i<n; i++)
		    a[i]=sc.nextInt();
    for(int j=n-1; j>=0; j--)
        System.out.print(a[j]+" ");
	}
}
