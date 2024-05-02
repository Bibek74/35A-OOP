

import java.util.Scanner;

public class task6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        sc.close();
        
        System.out.println("Sum of two number: " + (a+b));
        System.out.println("Product of two number: " + (a*b));;
    }
}
