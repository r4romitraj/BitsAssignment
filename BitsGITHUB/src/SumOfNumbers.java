import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {

        int a = 0,b=0,sum=0;
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter first number");
        a=sc.nextInt();
        System.out.println("Enter second number");
        b=sc.nextInt();
        sum =a+b;
        System.out.println("Sum of two number is :" +sum);

    }
}