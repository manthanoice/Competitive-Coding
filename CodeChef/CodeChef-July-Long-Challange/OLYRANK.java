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
		    int a[] = new int[6];
		    for(int i=0; i<6; i++){
		        a[i] = sc.nextInt();
		    }
		    int sum1 = a[0]+a[1]+a[2];
		    int sum2 = a[3]+a[4]+a[5];
		    String s = (sum1>sum2)?"1":"2";
		    System.out.println(s);
		}
	}
}
