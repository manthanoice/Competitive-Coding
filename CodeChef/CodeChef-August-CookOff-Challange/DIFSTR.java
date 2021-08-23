/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    static class FastReader 
    { 
        BufferedReader br; 
        StringTokenizer st; 

        public FastReader() 
        { 
            br = new BufferedReader(new InputStreamReader(System.in)); 
        } 

        String next() 
        { 
            while (st == null || !st.hasMoreElements()) 
            { 
                try
                { 
                    st = new StringTokenizer(br.readLine()); 
                } 
                catch (IOException  e) 
                { 
                    e.printStackTrace(); 
                } 
            } 
            return st.nextToken(); 
        } 

        int nextInt() 
        { 
            return Integer.parseInt(next()); 
        } 

        long nextLong() 
        { 
            return Long.parseLong(next()); 
        } 

        double nextDouble() 
        { 
            return Double.parseDouble(next()); 
        } 

        String nextLine() 
        { 
            String str = ""; 
            try
            { 
                str = br.readLine(); 
            } 
            catch (IOException e) 
            { 
                e.printStackTrace(); 
            } 
            return str; 
        } 
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		FastReader sc = new FastReader();
		int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            String ans = "";
            for(int i=0; i<n; i++){
                String s = sc.nextLine();
                if(s.charAt(i)=='0')
                    ans+="1";
                else
                    ans+="0";
            }
            System.out.println(ans);
        }
	}
}
