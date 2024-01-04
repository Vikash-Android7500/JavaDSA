package ThardDay.ifElse;

import java.util.Scanner;

public class ConditionalStatements {
     public static void main(String[] args) {
          try (Scanner scan = new Scanner(System.in)) {
               System.out.println("Enter Your Age: ");
               int Age = scan.nextInt();

               if (Age > 18) {
                    System.out.println("Adult");  
               } else {
                    System.out.println("No Adult");
               }
          }
     }
}
