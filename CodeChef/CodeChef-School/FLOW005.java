/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to b5,10e "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc=new Scanner(System.in);
        int a[]={100,50,10,5,2,1};
        int t=sc.nextInt();
        while(t-->0){
            int count=0;
            int n=sc.nextInt();
            for(int i=0;i<a.length;i++){
                count=count+n/a[i];
                n=n%a[i];
                if(n==0)
                    break;
            }
            System.out.println(count);
        }
    
	}
}
