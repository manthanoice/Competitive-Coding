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
		    int n1 = sc.nextInt();
		    int n2 = sc.nextInt();
		    int count = 0;
		    for(int i=n1; i<=n2; i++)
		        if(i%10==2||i%10==3||i%10==9)
		            count++;
		    System.out.println(count);
		}
	}
}
