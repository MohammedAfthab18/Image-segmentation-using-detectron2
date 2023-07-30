public class Employee {

    int empId;
    String designation;
    float salary;
    void setSalary(float sal){
        salary = sal;
    }
    float getSalary(){
        return salary;
    }
    public static void main(String[] args) {
        //object_name.method_name()
        //object_name.method_name()
        //memory is saved jvm does not have to call the function every time ,By creating a class we can call the function easily
        Employee e1 = new Employee();
        e1.setSalary(1000.0f);
        System.out.println("The salary of employee : " +e1.getSalary());
    }
}

/*
class Pen {
    // class
    String color; // red , blue , black
    String type; // ballpoint ; gel
    // functions are inside the class which is known as methods
    //properties are color type
    // class data and members are the methods
    // declarations of functions are always in camelCase
    // class are declared in capital letters first

    public void printType () {
        System.out.println(this.type);
    }
    public void printColor(){
        System.out.println(this.color);
    }
}
class Student {
    String name;
    int age ;

    public void printInfo (){
        System.out.println(this.name);
        System.out.println(this.age);
    }

}

public class OOPS {
    public static void main(String args[]) {
        Pen pen1 = new Pen();
        pen1.color = "Blue";
        pen1.type = "Gel";

        Pen pen2 = new Pen();
        pen2.color = "Black";
        pen2.type = "Ballpoint";

        pen1.printType();
        pen2.printType();

        pen1.printColor();
        pen2.printColor();

        Student stud1 = new Student();

        Student stud2 = new Student();

        stud1.name = "Afthab";
        stud2.name = "Hari";

        stud2.age = 17;
        stud1.age = 24;

        stud1.printInfo();
        stud2.printInfo();
    }
}

//Non parameterized constructor

Student (){
sout ("Constructor Called")
}


class Student {
    String name;
    int age ;

    public void printInfo (){
        System.out.println(this.name);
        System.out.println(this.age);
    }

    // parameterized constructor
    Student(String name , int age) {
        this.name = name;
        this.age = age;
    }

}

public class OOPS {
    public static void main(String args[]) {

        Student s1 = new Student("Mohammed Aftab" , 19);
        s1.printInfo();
    }
}

//copy constructor

    Student(Student s2) {
        this.name = s2.name;
        this.age = s2.age;
    }

    Student(){

    }
}

public class OOPS {
    public static void main(String args[]) {

        Student s1 = new Student();

        s1.name = "hari";
        s1.age = 21;

        Student s2 = new Student(s1);
        s2.printInfo();
    }
}




//polymorphism
// Function overloading
//Compile time polymorphism (strict checking ) vs runtime polymorphism (not strict )
class Student {
    String name;
    int age ;

    public void printInfo(String name){
        System.out.println(name);
    }

    public void printInfo(int age){
        System.out.println(age);
    }

    public void printInfo(String name , int age ){
        System.out.println(name + " " + age);
    }
}

public class OOPS {
    public static void main(String args[]) {

        Student s1 = new Student();

        s1.name = "hari";
        s1.age = 21;

        s1.printInfo(s1.name);
        s1.printInfo(s1.name , s1.age);

    }
}
import com.sun.security.jgss.GSSUtil;
import java.util.Collections;
import javax.naming.PartialResultException;
import java.util.*;
import java.util.ArrayList;
class Main {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<Integer>();

        // add elements
        list.add(0);
        list.add(3);
        list.add(4);
        list.add(2,2);

        System.out.println(list);
        System.out.println(list.get(2));

        list.remove(3);
        System.out.println(list);

        System.out.println(list.size());

        list.set(0,5);
        System.out.println(list);

        list.remove(0);
        System.out.println(list);

        for (int i = 0; i < list.size(); i++){
            System.out.print(list.get(i));
        }
        System.out.println();

        Collections.sort(list);
        System.out.println(list);

        }

    }


 */