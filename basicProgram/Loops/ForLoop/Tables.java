package Loops.ForLoop;

import java.util.Scanner;

public class Tables {
     public static void main(String[] args) {

       try ( Scanner scan = new Scanner(System.in)) {
               System.out.print("Enter Your Number: ");
               int Table = scan.nextInt();
               System.out.println("Your Table of: " + Table);

               /**
                * for (initialization; condition; update) {
                * // body of-loop
                * }
                */
               for (int colume = 1; colume <= 10; colume++) {

                    System.out.println(Table + " x " + colume + " = " + (colume * Table));
                    System.out.println();
               }
         }
     }
}
