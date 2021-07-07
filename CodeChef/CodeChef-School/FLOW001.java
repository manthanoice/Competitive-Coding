/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args)
	{
	    try {
	        	// your code goes here
		        Scanner sc = new Scanner(System.in);
	            int t = sc.nextInt();
	            int sum = 0;
	            for(int i=0; i<=t; i++){
	                    int a = sc.nextInt();
            	        int b = sc.nextInt();
            	        sum = a+b;
            	        System.out.println(sum);
            	        sum=0;
	            }
	        } catch(Exception e) {
	    }
	}
}
