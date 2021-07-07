/* package codechef; // don't place package name! */
//don't forget to take long cause if you will take int then it will give the wrong output
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
		    long n = sc.nextInt();
		    long answer = 0;
		    while(n>0){
		        long remainder = n%10;
		        answer = (answer*10)+remainder;
		        n/=10;
		    }
		    System.out.println(answer);
		}
	}
}
