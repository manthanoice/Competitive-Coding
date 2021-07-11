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
		int answer = n/3;
		if(n%3!=0)
		    System.out.println("-1");
		else if(answer%2==0)
		    System.out.println("0");
        else if(answer%2!=0)
            System.out.println("1");
	}
}
