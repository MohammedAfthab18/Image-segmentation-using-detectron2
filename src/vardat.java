import java.util.Scanner;

 public class vardat {
     public static void main(String[] args) {

         Scanner read = new Scanner(System.in);
         double radius = read.nextDouble();

         double pi = 3.14;

         double circumference = 2 * pi * radius;

         System.out.println(circumference);
     }
 }