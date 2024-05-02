

import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Principle: ");
        float p = sc.nextFloat();
        System.out.print("Enter Time: ");
        float t = sc.nextFloat();
        System.out.print("Enter Rate: ");
        float r = sc.nextFloat();
        sc.close();
        float si = (p*t*r)/100;
        System.out.println("Simple Interest: " + si +"%");
    }
}
