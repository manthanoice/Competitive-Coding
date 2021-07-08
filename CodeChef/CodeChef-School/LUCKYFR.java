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
    			int answer = 0;
	    		int count = 0;
    		while(n!=0){
    			answer = n%10;
    			n/=10;
    			if(answer==4)
    				count++;
    		}
		    System.out.println(count);
		}
	}
}
