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
		int count1 = 0;
		int count2 = 0;
	    int arr[]=new int[n];
	    for(int i=0; i<n; i++){
	        arr[i]=sc.nextInt();
		}
		for(int i=0; i<n; i++){
		    if(arr[i]%2==0)
		        count1++;
            else
                count2++;
		}
		String s = (count1>count2)?"READY FOR BATTLE":"NOT READY";
		System.out.println(s);
	}
}
