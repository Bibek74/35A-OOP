

import java.util.Scanner;

public class task12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int num = sc.nextInt();
        sc.close();
        if(num%5==0 && num%11==0){
            System.out.println("Divided by 5 and 11.");
        }
        else{
            System.out.println("Not divisible by 5 and 11.");
        }
        }
}
