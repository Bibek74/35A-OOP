

import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age:");
        int age = sc.nextInt();
        sc.close();
        if(age>18){
            System.out.println("Eligible to vote.");
        }
        else{
            System.out.println("Not eligible to vote.");
        }
    }

}
