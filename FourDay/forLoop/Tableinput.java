package FourDay.forLoop;

import java.util.Scanner;

public class Tableinput {
     public static void main(String[] args) {
          try (Scanner scan = new Scanner(System.in)) {
               System.out.println("Your Table: ");
               int table = scan.nextInt();

               for (int column = 1; column < 11; column++) {
                    System.out.println(column * table);
               }
          }
     }
}
