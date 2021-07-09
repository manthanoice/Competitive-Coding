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
		int p1=0, p2=0, difference=0, win=0, lar=0;
		while(t-->0){
		    int a = sc.nextInt();
		    int b = sc.nextInt();
		    p1=p1+a;
		    p2=p2+b;
		    if((p1-p2)>(p2-p1) && p1-p2 > difference)
		    {
		        difference=p1-p2;
		        win=1;
		    }
		    else if ((p2-p1>p1-p2) && p2-p1 > difference)
		    {
		        difference=p2-p1;
		        win=2;
		    }
		}
		System.out.println(win+" "+difference);
	}
}
