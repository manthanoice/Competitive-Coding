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
		int k = sc.nextInt();
		int a[] = new int[n];
		for(int i=0; i<n; i++)
		    a[i]=sc.nextInt();
		boolean present = false;
		for(int i=0; i<n; i++){
		    if(a[i]==k){
		        present = true;
		        break;
		    }
		}
		String s = (present)?"1":"-1";
		System.out.println(s);
	}
}
