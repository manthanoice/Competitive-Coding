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
		double bal_before = sc.nextDouble();
		double bal_after = sc.nextDouble();
		if(bal_before%5==0 && bal_after>=bal_before+0.50){
		    bal_after=bal_after-(bal_before+0.50);
		}
        System.out.printf("%.2f", bal_after);
	}
}
