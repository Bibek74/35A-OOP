

import java.util.Scanner;

public class task7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        sc.nextLine();
        
        System.out.print("Enter your interest: ");
        String interest = sc.nextLine();

        sc.close();

        System.out.println("Hi ! My name is " + name + " I'm "+age +" years old" + " and my interest is in " + interest);
        
    }
}
