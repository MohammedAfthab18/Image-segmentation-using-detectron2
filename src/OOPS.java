import java.util.*;
//base class
class Shape {
    public void area(){
        System.out.println("Displays area");
    }
}
//derived class extends keyword and base class
class Triangle extends Shape {
    public void area (int l, int h ){
        System.out.println(1/2 * l * h);
    }
}
class Circle extends Shape {
    public void area (int r){
        System.out.println((3.14)*r*r);
    }
}


public class OOPS {
    public static void main(String args[]) {
        Triangle t1 = new Triangle ();


    }
}
