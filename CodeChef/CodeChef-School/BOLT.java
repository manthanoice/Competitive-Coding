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
		    float k1 = sc.nextFloat();
		    float k2 = sc.nextFloat();
		    float k3 = sc.nextFloat();
		    float v = sc.nextFloat();
		    float answer = 100/(k1*k2*k3*v);
            float finalAnswer = (float)Math.round(answer*100)/100;
            if(finalAnswer<9.58f)
                System.out.println("Yes");
            else
                System.out.println("NO");
		}
	}
}
