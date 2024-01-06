package FourDay.forLoop;

public class NestedLoop {
     public static void main(String[] args) {

          for (int column = 1; column <= 3; column++) {
               System.out.println("_______________");
               for (int row = 1; row <= 8; row++) {
                    System.out.print(row + " ");
               }
               System.out.println();
          }
     }
}
