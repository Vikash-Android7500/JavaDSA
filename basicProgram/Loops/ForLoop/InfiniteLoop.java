package Loops.ForLoop;

public class InfiniteLoop {
     public static void main(String[] args) {
          short number = 0;
          for (;;) {
               System.out.println("infinite loop  " + number++);
          }
     }
}
