package SwitchStatement;

import java.util.Scanner;

public class LiteBord {
     public static void main(String[] args) {
         try (Scanner scan = new Scanner(System.in)) {

               System.out.println("click Your Button:  ");
               byte button = scan.nextByte();

               switch (button) {
                    case 1: System.out.println("Lite ON (-_-)");
                    break;
                    case 2: System.out.println("Lite OFF (-^-)");
                    break;
                    case 3: System.out.println("Fan ON (-_-)");
                    break;
                    case 4: System.out.println("Fan OFF (-^-)");
                    break;
                    default: System.out.println("कटआउट निकालो ");
               }
          }
     }
}
