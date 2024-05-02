

import java.util.Scanner;

public class task8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the marks of Physics: ");
        double phy = sc.nextDouble();

        System.out.print("Enter the marks of Chemistry: ");
        double chem = sc.nextDouble();

        System.out.print("Enter the marks of Maths : ");
        double maths = sc.nextDouble();
        sc.close();

        double totalPercentage = (phy + chem + maths)/300 *100;
        String formattedPercentage = String.format("%.2f", totalPercentage);
        String grade;

        if (totalPercentage > 90 && totalPercentage <= 100){
            grade = "A+";
        }
        else if (totalPercentage > 80 && totalPercentage <= 90){
            grade = "A";
        }
        else if (totalPercentage > 70 && totalPercentage <= 80){
            grade = "B+";
        }
        else if (totalPercentage >=60 && totalPercentage <= 70){
            grade = "B";
        }
        else{
            grade = "Failed";
        }
        if (totalPercentage>=60){
            System.out.println("\nCongratulations!");
            System.out.println("Total: " + formattedPercentage +"%");
            System.out.println("Grade :" + grade );
        }
        else{
            System.out.println("\nTotal: " + formattedPercentage +"%");
            System.out.println("Grade :" + grade );
        }
    }
    
}