
import java.util.*;
class funbro{
    public static void main(String[]args){

        Scanner read = new Scanner(System.in);
        int size = read.nextInt();
        int arr [] = new int[size];
        //input
        for ( int i = 0; i <size; i++){
            arr[i]= read.nextInt();
        }

        int x = read.nextInt();

        //output
        for(int i = 0; i<arr.length;i++){
            if (arr[i]== x){
                System.out.println("X is found at index " + i);
            }
        }
    }
}

/*
import java.util.*;
class Main{
    public static void main (String[]args) {
        StringBuilder sb = new StringBuilder("tony");
        System.out.println(sb);
        sb.setCharAt(0, 't');
        System.out.println(sb);
        System.out.println(sb.charAt(0));
        System.out.println("is");
        sb.insert(2, 'n');
        System.out.println(sb);
        sb.delete(2,3);
        System.out.println(sb);
        sb.append("s");
        sb.append("t");
        sb.append("a");
        sb.append("r");
        sb.append("k");
        System.out.println(sb);
        System.out.println(sb.length());


    }


}

import java.util.*;
import java.io.*;
public class funbro{
    public static void main(String[]args) {
        Scanner read = new Scanner (System.in);
        int size =  read.nextInt();
        String names[] = new String[size];

        for (int i = 0; i<size;i++){
            names[i] =read.next();
        }

        for ( int i =0; i <names.length;i++){
            System.out.println("Name "+ " " +(i+1)+ "is " + " " +names[i]);
        }
    }
    }
        // Instantiating an array
        int arr[]  = {11,13,27,28,29};
        for ( int i =0; i <arr.length;i++){
            System.out.println("Element at index "+ i +": "+ arr[i]);
        }
        // other way
    }

}
//
// GCD
//
import java.util.*;
class Main{
    public static void main(String[]args){
        Scanner read = new Scanner (System.in);
        int n1 = read.nextInt();
        int n2 = read.nextInt();

        while (n1 != n2){
            if (n1> n2){
                n1 = n1 - n2;
            }else{
                n2 = n2 - n1;
            }
        }
        System.out.println(n2);
    }
}
import java.util.*;
public class Main {
    public static void checkEligible(int age){
        if (age > 18){
            System.out.println("He/She is eligible to vote");
        }else {
            System.out.println("He/She is not eligible to vote");
        }
    }
    public static void main (String[]args){
        Scanner read = new Scanner(System.in);
        int age = read.nextInt();
        checkEligible(age);
    }
}

import java.util.*;
public class Main {
    public static double calcCircumference (int radius){
        double pi = 3.14;
        double circumference = 2 * pi * radius;
        return circumference;
    }

    public static void main(String[]args){
        Scanner read= new Scanner(System.in);
        int radius = read.nextInt();
        double circumference = calcCircumference(radius);
        System.out.println(circumference);
    }
}

import java.util.*;
public class Main {
    public static int sumOddNumbers(int n){
        int sum =0;
        for (int i =1; i<=n;i++){
            if (i %2 !=0){
                sum+=i;
            }
        }
        return sum;
    }
    public static void main (String[]args){
        Scanner read = new Scanner(System.in);
        int n = read.nextInt();
        int sum = sumOddNumbers(n);
        System.out.println(sum);
    }
}

import java.util.*;

public class Main {
    public static void checkGreat(int a ,int b){
        if (a > b){
            System.out.println("a is greater than b" + a +">"+ b);
        }else {
            System.out.println("b is greater than a " + " " +b + ">" + a);
        }
    }
    public static void main (String[]args){
        Scanner read = new Scanner(System.in);
        System.out.println("Enter a");
        int a = read.nextInt();
        System.out.println("Enter b");
        int b = read.nextInt();
        checkGreat(a,b);
    }

}

import java.util.*;
 public class funbro {
    public static void printFact(int n){
        if (n == 0){
            System.out.println("Invalid input");
            return ;
        }
        int factorial = 1;
        for (int i = n; i>=1;i--){
            factorial = factorial * i;
        }
        System.out.println(factorial);
    }
    public static void main(String[]args){
        Scanner read = new Scanner (System.in);
        int n = read.nextInt();
        printFact(n);
    }
}

    public static int calcProNumbers(int a , int b){
        int product = a * b;
        return product;
    }
    public static void main (String[]args){
        Scanner read = new Scanner(System.in);
        int a = read.nextInt();
        int b = read.nextInt();
        int product = calcProNumbers(a,b);
        System.out.println(product);
    }
}

    // public static void printMyName ( use camelcase for function name )
    // applied string type arg (functional input for the function printMyName )
    public static void printMyName(String name){
        System.out.println(name);
        return;
        // break the statement
    }
    public static void main (String[]args){
        // Taking input
        Scanner read = new Scanner(System.in);
        String name = read.next();
        printMyName(name); // calling out the function
    }

}
          returnType functionName (type arg1, type arg2,..){
          // operations }

          return type - int float string
          another type of return type is void which returns nothing
          public and static are the keywords used in the programmes (oops concepts)

          keep the name of the function in related to what we gonna print in the statement

          args are the function's input

          type arg can be int float double thats the functional args can have different types of inputs
          for eg :
             int age
             float temp

             what happens in the memory when we use function
              the functions are arranged in stack structure

// print a given name in a function
// Make a function to add two numbers and return the sum
// Make a function to multiply 2 numbers and return the product
// Find the Factorial of a number





 */
