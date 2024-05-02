

import java.util.Scanner;

public class task10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.print("Enter third number: ");
        int c = sc.nextInt();

        sc.close();

        if( a>b && a>c){
            System.out.println(" Maximum number is " + a);
        }
        else if ( b>a && b>c){
            System.out.println("Maximum number is " + b);
        }
        else{
            System.out.println("Maximum number is " + c);
        }

    }
}