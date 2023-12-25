package SecondDay;
import java.util.*;

public class UserInput {
     public static void main(String[] args) {
          try (Scanner scan = new Scanner(System.in)) {
               System.out.println("your Name: ");
               String name = scan.nextLine();
               System.out.println("your Age: ");
               String Age = scan.next();
               System.out.println(name);
               System.out.println(Age);
               // Add Numbers....
               System.out.println("firstNumber ");
               byte item1 = scan.nextByte();
               System.out.println("secondNumber");
               byte item2 = scan.nextByte();
               int sum = item1 + item2;
               System.out.println("Add Number: " + sum);
          }
     }
}
