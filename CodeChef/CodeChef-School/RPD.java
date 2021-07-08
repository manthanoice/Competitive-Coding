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
		    int []a = new int[n];
		    for(int i=0; i<n; i++){
		        a[i]=sc.nextInt();
		    }
		    int max = 0;
		    int ans = 0;
		    for(int i=0; i<n; i++){
		        for(int j=i+1; j<n; j++){
		            ans = a[i]*a[j];
		            int sum = 0;
		            while(ans!=0){
		                int remainder = ans%10;
		                sum = sum + remainder;
		                ans/=10;
		            }
		            if(sum>max)
		                max=sum;
		        }
		    }
		    System.out.println(max);
		}
	}
}
