/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    static long hcm(long a, long b){
        if(b==0)
            return a;
        else
            return hcm(b,a%b);
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
	    long a = sc.nextLong();
	    long b = sc.nextLong();
	    long hcm = hcm(a,b);
        long lcm = (a*b)/hcm;
        System.out.println(hcm+" "+lcm);
	}
}
