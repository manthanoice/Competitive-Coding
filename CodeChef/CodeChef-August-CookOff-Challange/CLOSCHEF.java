/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    static boolean check(int a[], int n, int value){
        for(int i=0; i<n; i++)
            if(a[i]==value)
                return true;
        return false;
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
		    int n = sc.nextInt();
		    int arr[] = new int[n];
		    for(int i=0; i<n; i++)
		        arr[i] = sc.nextInt();
		    Arrays.sort(arr);
		    int x = arr[0]*arr[1];
		    int y = arr[n-1]*arr[n-2];
		    int z = arr[0]*arr[n-1];
		    boolean ans1 = check(arr, n, x);
		    boolean ans2 = check(arr, n, y);
		    boolean ans3 = check(arr, n, z);
            if(n==1){
                System.out.println(1);
                continue;
            }
		    if(!ans1){
		        System.out.println(0);
		        continue;
		    }
		    if(!ans2){
		        System.out.println(0);
		        continue;
		    }
		    System.out.println((!ans3)?0:1);
		}
	}
}
