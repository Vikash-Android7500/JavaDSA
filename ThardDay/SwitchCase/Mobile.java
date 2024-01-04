package ThardDay.SwitchCase;

import java.util.Scanner;

public class Mobile {
     public static void main(String[] args) {
          try (Scanner scan = new Scanner(System.in)) {
               System.out.println("Best Mobile choge..");
               String mobile = "";
               mobile = scan.next();

               switch (mobile) {
                    case "samsung":
                         System.out.println("Galaxy S23");
                         break;
                    case "motorola":
                         System.out.println("Moto G54");
                         break;
                    case "redmi":
                         System.out.println("Redmi Note 13 Pro");
                         break;

                    default:
                         System.out.println("invalide Mobile!!");
                         break;
               }
          }
     }
}
