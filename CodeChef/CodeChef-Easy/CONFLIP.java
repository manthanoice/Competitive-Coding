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
		    int x = sc.nextInt();
		    while(x-->0){
		        int i = sc.nextInt();
		        int n = sc.nextInt();
		        int q = sc.nextInt();
		        int answer = 0;
		        if(i==q)
		            answer=n/2;
		        else
		            answer=n-n/2;
		        System.out.println(answer);
			}
		}
	}
}
