

import java.util.Scanner;

public class task9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any alphabet: ");
        String alphabet = sc.nextLine();
        sc.close();
        
        if (alphabet.equalsIgnoreCase("a") || alphabet.equalsIgnoreCase("e") || alphabet.equalsIgnoreCase("i") || alphabet.equalsIgnoreCase("o") || alphabet.equalsIgnoreCase("u")) {
            System.out.println("Vowel");
        } else {
            System.out.println("Consonant");
        }
    }
}
