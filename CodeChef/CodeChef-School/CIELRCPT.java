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
		    int limit = 2048;
		    int count = 0;
		    while(n!=0){
		        int i=11;
		        while((int)Math.pow(2,i)>n)
		            i-=1;
                count+=1;
                n=n-(int)Math.pow(2,i);
		    }
		    System.out.println(count);
		}
	}
}

// /* package codechef; // don't place package name! */

// import java.util.*;
// import java.lang.*;
// import java.io.*;

// /* Name of the class has to be "Main" only if the class is public. */
// class Codechef
// {
// 	public static void main (String[] args) throws java.lang.Exception
// 	{
// 		// your code goes here
// 		Scanner sc = new Scanner(System.in);
// 		int t = sc.nextInt();
// 		while(t-->0){
// 		    int n = sc.nextInt();
// 		    int limit = 2048;
// 		    int count = 0;
// 		    while(n!=0){
// 		        if(limit<=n){
// 		            count+=(n/limit);
// 		            n%=limit;
// 		        }
// 		        limit/=2;
// 		    }
// 		    System.out.println(count);
// 		}
// 	}
// }
