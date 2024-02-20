package controlStatement;

import java.util.Scanner;

public class condition2 {
     public static void main(String[] args) {
          try (Scanner scan = new Scanner(System.in)) {

               System.out.println("Type First Number: ");
               byte Number1 = scan.nextByte();
               
               System.out.println("Type Second Number: ");
               byte Number2 = scan.nextByte();

               if (Number1 == Number2) {
                    System.out.println("Number is Equal");
               } else if (Number1 > Number2){
                    System.out.println("a is greater than");
               } else {
                    System.out.println("a is lesse than");
               }
          }





     }
}
