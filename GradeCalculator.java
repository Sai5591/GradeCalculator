

import java.util.Scanner;

public class GradeCalculator {
    public static void main(String args[]) {
        int marks[] = new int[6];
        int i;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your test score:");
        i = scanner.nextInt();
        scanner.close();
        
        System.out.print("The Grade is: ");
        if(i >= 90 && i<=100) {
            System.out.println("A");
        } else if(i >= 80 && i < 90) {
            System.out.println("B");
        } else if(i >= 70 && i < 80) {
            System.out.println("C");
        } else if(i >= 60 && i < 70) {
            System.out.println("D");
        } else if(i >= 50 && i < 60) {
            System.out.println("E");
        } else if(i < 50) {
            System.out.println("F");
        
        }
        else if(i<=0 ||i>100){
          System.out.println("please provide valid marks");
        
      }
    }
}