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
		int flag;
		while(t-->0){
		    flag=0;
		    int n = sc.nextInt();
		    if(n==1||n==0)
		        System.out.println("no");
            else{
    		    for(int i=2; i<n/2; i++){
    		        if(n%i==0){
    		            flag=1;
    		            break;
    		        }
    		    }
    		    String s = (flag==0)?"yes":"no";
    		    System.out.println(s);
            }
		}
	}
}
