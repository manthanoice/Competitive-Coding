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
		    int n = sc.nextInt();
		    int a[][] = new int [n][n];
		    for(int i=0; i<n; i++)
		        for(int j=0; j<i+1; j++)
		            a[i][j] = sc.nextInt();
		    for(int i=n-1; i>0; i--)
		        for(int j=0; j<i; j++)
		            if(a[i][j]>a[i][j+1])
		                a[i-1][j] += a[i][j];
		            else
		                a[i-1][j] += a[i][j+1];
		    System.out.print(a[0][0]+"\n");
		}
	}
}
