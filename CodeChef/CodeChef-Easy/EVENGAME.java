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
            	int sum = 0;
		    int n = sc.nextInt();
		    int arr[] = new int[n];
		    for(int i=0; i<n; i++){
		        int x = sc.nextInt();
		        sum+=x;
		    }
		    String s = (sum%2==0)?"1":"2";
		    System.out.println(s);
		  //  if(sum%2==0)
		  //      System.out.println("1");
		  //  else
		  //      System.out.println("2");
		  
		}
	}
}
