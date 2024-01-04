package ThardDay.ifElse;

import java.util.Scanner;

public class TwoNumberChack {
     public static void main(String[] args) {
          try (Scanner scan = new Scanner(System.in)) {
               System.out.println("Type Your Two Number: ");
               int Number1 = scan.nextInt();
               int Number2 = scan.nextInt();

               if (Number1 == Number2) {
                    System.out.println("Equal Number: ");
               } else if (Number1 > Number2) {
                    System.out.println("Not Equal: ");
               } else {
                    System.out.println("No Number: ");
               }
          }
     }
}
