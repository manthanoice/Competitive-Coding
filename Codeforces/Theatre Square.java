import java.util.*;
import java.lang.*; 
 
public class TS{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double n = sc.nextInt(); //length of rectangle
        double m = sc.nextInt(); //width of rectangle
        double a = sc.nextInt(); //length of square
        //MATH.ceil(double a) returns the smallest (closest to negative infinity) double value that is greater than //or equal to the argument and is equal to a mathematical integer. Special cases
        // int answer = (int)(Math.ceil(n/a)*Math.ceil(m/a)); this will be wrong and fail at 9th test case 
        System.out.println((long)(Math.ceil(n/a)*Math.ceil(m/a))); //Not sure if this will work either but let's see
    }
}
