import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        /* Fibonacci [0 1] 1 2 3 5 8 13 ...
        enter number 15 fibonacci till 13 only last number less than 15
        */
        Scanner input =new Scanner(System.in);
        System.out.println("Welcome to fibonacci calculator");
        System.out.println("Enter no till where fibonacci is to be calculated");
        int number=input.nextInt();
        fibonacciNumber(number);
    }
    public static void fibonacciNumber(int num1){
        //constant
        if(num1 <0) return;
        if(num1 == 0) return;


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
