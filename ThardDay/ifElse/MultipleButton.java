package ThardDay.ifElse;

import java.util.Scanner;

public class MultipleButton {
     public static void main(String[] args) {
          try (Scanner scan = new Scanner(System.in)) {
               System.out.println("Click Your Button: ");
               int button = scan.nextInt();

               if (button == 1) {
                    System.out.println("Hello");
               } else if (button == 2) {
                    System.out.println("Namaste");
               } else if (button == 3) {
                    System.out.println("Ni hao");
               }
               else {
                    System.out.println("Invalide Button!");
               }
          }
     }
}
