package controlStatement;
import java.util.Scanner;

public class Condition {
     public static void main(String[] args) {
          try (Scanner scan = new Scanner(System.in)) {

               System.out.println("Type Your Age: ");
               int Age = scan.nextInt();

               if (Age <= 18) {
                    System.out.println("childarn: " + Age);
               } else {
                    System.out.println("Your are Adult: " + Age);
               }
          }
     }
}
