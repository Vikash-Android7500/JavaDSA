package ThardDay.SwitchCase;

import java.util.Scanner;

public class ElectronicBord {
     public static void main(String[] args) {
          try (Scanner scan = new Scanner(System.in)) {
               System.out.println("Click Button: ");
               int button = scan.nextInt();

               switch (button) {
                    case 1:
                         System.out.println("Hello");
                         break;
                    case 2:
                         System.out.println("Namaste");
                         break;
                    case 3:
                         System.out.println("Ni hao");
                         break;
                    default:
                         System.out.println("Invalide Button");
                         break;
               }
          }
     }
}
