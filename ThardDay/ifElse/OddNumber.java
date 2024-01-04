package ThardDay.ifElse;

import java.util.Scanner;

public class OddNumber {
     public static void main(String[] args) {
     
          try (Scanner scan = new Scanner(System.in)) {
               System.out.println("Enter your Odd Number: ");
               int Number = scan.nextInt();
               if (Number % 2 == 0) {
                    System.out.println("Even Number: ");
               } else {
                    System.out.println("Odd Number");
               }
          }
     }
}
