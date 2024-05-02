

import java.util.Scanner;

public class task11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int a = sc.nextInt();
        sc.close();
        if (a> 0){
            System.out.println("The number is Positive.");
        }
        else if(a<0){
            System.out.println("The number is Negative.");
        }
        else{
            System.out.println("The number is Zero.");
        }
    }
}
