

import java.util.Scanner;

public class task18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any case: ");
        String shape = sc.nextLine();
        switch (shape) {
            case "C":
                System.out.print("Enter radius: ");
                int radius = sc.nextInt();
                System.out.println("Area of circle: " + (3.14*Math.pow(radius, 2)));
                break;
            case "R":
                System.out.print("Enter length: ");
                int l = sc.nextInt();
                System.out.print("Enter breadth: ");
                int b = sc.nextInt();
                System.out.println("Area of circle: " + (l*b));
                break;
            case "S":
                System.out.print("Enter length: ");
                int a = sc.nextInt();
                System.out.println("Area of Square: " + (a*a));
                break;
            case "T":
                System.out.print("Enter base: ");
                int base = sc.nextInt();
                System.out.print("Enter height: ");
                int height = sc.nextInt();
                System.out.println("Area of Trianlge: " + (base*height)/2);
                break;
            default:
                System.out.println("Wrong case.");
                break;
        }
        sc.close();
    }
    
}
