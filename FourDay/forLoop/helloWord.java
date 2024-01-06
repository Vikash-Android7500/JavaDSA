package FourDay.forLoop;

public class helloWord {
     public static void main(String[] args) {
          byte A = 0;
          String Name = " Vikash";
          
          for (int i = 0; i < Name.length(); i++) {
               System.out.println("___________");
               System.out.println(++A + Name);
          }
     }
}
