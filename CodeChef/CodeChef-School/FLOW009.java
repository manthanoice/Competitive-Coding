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
		    double quantity = sc.nextDouble();
		    double price = sc.nextDouble();
		    double answer = quantity*price;
		  //  long final_answer = 0;
		    if(quantity>1000){
		        answer-=(((10*price)/100)*quantity);
		      //  final_answer=answer*price;
		        System.out.println(answer);
		    }
		    if(quantity<1000){
		      //  answer=price*quantity;
                System.out.println(answer);
		    }
		}
	}
}
