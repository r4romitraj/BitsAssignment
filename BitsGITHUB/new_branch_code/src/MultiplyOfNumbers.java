import java.util.Scanner;

public class MultiplyOfNumbers {
    public static void main(String[] args) {

        int a = 0,b=0,Multiplication=0,Division=0;
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter first number");
        a=sc.nextInt();
        System.out.println("Enter second number");
        b=sc.nextInt();
        Multiplication =a*b;
        System.out.println("Multiplication of two number is :" +Multiplication);
        Division=a/b;
        System.out.println("Multiplication of two number is :" +Division);

    }
}