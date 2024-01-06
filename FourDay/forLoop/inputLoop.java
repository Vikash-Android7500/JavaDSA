package FourDay.forLoop;

import java.util.Scanner;

public class inputLoop {
     public static void main(String[] args) {
          try (Scanner scan = new Scanner(System.in)) {
               System.out.println("Your Number: ");
               int number = scan.nextInt();

               int sum = 0;
               for (int column = 0; column <= number; column++) {
                    sum = sum + 1;
               }
               System.out.println(sum);
          }
     }
}
