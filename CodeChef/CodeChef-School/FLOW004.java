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
		Scanner sc = new Scanner (System.in);
		int t = sc.nextInt();
		for(int i=0; i<t; i++){
		    int n = sc.nextInt();
		    int sum = 0;
		    int last = n%10;
		    int first=0;
		    while(n!=0){
		        first=n%10;
		        n=n/10;
		    }
		    sum=first+last;
		    System.out.println(sum);
		}
	}
}
