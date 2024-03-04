
 /* Fibonacci Series -> [0 1] 1 2 3 5 8 13 ...
        [0,1] -> These two numbers are initially fixed in the fibonacci series
  
        This program  will take an input from the user, lets say 15, then the fibonacci series displayed will be till 15 only and hence here the last
        number of our fibonacci series is 13, as it the last number of the fibonacci series less than 15
        */

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
       
        Scanner input =new Scanner(System.in);
        System.out.println("Welcome to fibonacci calculator");
        System.out.println("Enter no till where fibonacci is to be calculated");
        int number=input.nextInt();
        fibonacciNumber(number);
    }
    public static void fibonacciNumber(int num1){

        if(num1 <0) return;
        if(num1 == 0) return;

        //constant



        System.out.print(0 + " ");
        System.out.print(1 + " ");
        int i=0;
        int sum=0;
        int j=1;
        while((j+i)<=num1){
            sum=i+j;
            System.out.print(sum + " ");
            i=j;
            j=sum;

        }
    }
}
