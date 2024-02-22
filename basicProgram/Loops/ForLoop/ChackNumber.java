package Loops.ForLoop;

import java.util.Scanner;

public class ChackNumber {
     public static void main(String[] args) {
          try (Scanner scan = new Scanner(System.in)) {
               int Number = scan.nextByte();

               int sum = 0;
               for (int item = 0; item <= Number; item++) {
                    sum = sum + 1;
               }
               System.out.println("Total Number: " + sum);
          }
     }
}
