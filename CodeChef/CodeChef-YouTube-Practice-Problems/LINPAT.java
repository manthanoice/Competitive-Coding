/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    static void sum(int n){
        int sum_1=0;
        for(int i=1; i<=n/2; i++){
            System.out.print(i*10+" ");
            System.out.print(i*2+" ");
        }
	}
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sum(n);
	}
}
