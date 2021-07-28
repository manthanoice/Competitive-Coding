import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        if (n%2!=0)
            System.out.println("Weird");
        if (n%2==0 && n>=2 && n<=5)
            System.out.println("Not Weird");
        if (n%2==0 && n>=6 && n<=20)
            System.out.println("Weird");
        if (n%2==0 && n>20)
            System.out.println("Not Weird");
    }
}
