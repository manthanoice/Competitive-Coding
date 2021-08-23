/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
/** Class for buffered reading int and double values */
class Reader {
    static BufferedReader reader;
    static StringTokenizer tokenizer;
    static void init(InputStream input) {
        reader = new BufferedReader(new InputStreamReader(input) );
        tokenizer = new StringTokenizer("");
    }
    static String next() throws IOException {
        while ( ! tokenizer.hasMoreTokens() ) {
            tokenizer = new StringTokenizer(reader.readLine() );
        }
        return tokenizer.nextToken();
    }

    static int nextInt() throws IOException {
        return Integer.parseInt( next() );
    }
	
    static double nextDouble() throws IOException {
        return Double.parseDouble( next() );
    }
}
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Reader.init(System.in);
		int t = Reader.nextInt();
		while(t-->0){
		    int n = Reader.nextInt();
		    int arr[] = new int[n];
		    int count = 0;
		    for(int i=0; i<n; i++)
		        arr[i] = Reader.nextInt();
		    for(int i=0; i<n; i++)
		        for(int j=i+1; j<n; j++)
		            if(arr[i]==arr[j])
		                count++;
		    System.out.println((count>1)?n-count:0);
		}
	}
}
