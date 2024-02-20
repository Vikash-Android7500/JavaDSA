package basicProgram;

import java.util.Scanner;

public class UserIntup {

     /**
      * @@@@@ User Input डेली एक Subject पर टाइम देना है
      * 90 डिनो तक एक दिन का कितना टाइम हुआ
      */
     public static void main(String[] args) {
          try (Scanner scan = new Scanner(System.in)) {

               System.out.println("Your Mothe Target: ");
               float Mothe = scan.nextFloat();

               System.out.println("Your Hour: ");
               float hour = scan.nextFloat();

               System.out.println(" Your Dayli Time hour: " + (Mothe / hour));
          }
          
          
     }
}
