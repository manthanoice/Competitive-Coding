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
		    int k = sc.nextInt();
		    int l = sc.nextInt();
		    int arr[] = new int[n];
		    boolean win = true;
		    for(int i=0; i<n; i++)
		        arr[i] = sc.nextInt();
		    int x = n-1;
		    int y = (l-1)*k;
		    for(int i=0; i<x; i++)
		        if(arr[i]>=arr[x])
		            win = false;
		    if(win)
		        System.out.println("Yes");
		    else{
		        arr[x]+=y;
		        for(int i=0; i<x; i++)
		            if(arr[i]>=arr[x])
		                win = true;
		        if(win)
		            System.out.println("No");
		        else
		            System.out.println("Yes");
		    }   
		}
	}
}
