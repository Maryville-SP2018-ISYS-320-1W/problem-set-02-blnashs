
public class Test {

}
//Prints several lines of stars.
//Uses a parameterized method to remove redundancy.
public class Stars2 {
 public static void main(String[] args) {
     line(13);
     line(7);
     line(35);
 }
 
 // Prints the given number of stars plus a line break.
 public static void line(int count) {
     for (int i = 1; i <= count; i++) {
         System.out.print("*");
     }
     System.out.println();
 }
}
