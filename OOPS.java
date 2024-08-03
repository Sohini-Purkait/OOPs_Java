class Pen{
    String color;
    String type; // ball pen, ink pen

    //methods
    public void write(){
        System.out.println("Writing something...");
    }

    public void printColor(){
        System.out.println(this.color);
    }

    public void printType(){
        System.out.println(this.type);
    }
}

class Student{
    String name;
    int age;

    public void printInfo(){
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
    }

    //non-parameterized constructor
    Student(){
        System.out.println("Constructor called");
    }

    //parameterized constructor
    Student(String name, int age){
        this.name = name;
        this.age = age;
    }

    //copy constructor
    Student(Student s){
        this.name = s.name;
        this.age = s.age;
    }
}


public class OOPS {
    public static void main(String[] args) {
        //object
        Pen pen1 = new Pen();
        pen1.color = "blue";
        pen1.type = "gel";

        Pen pen2 = new Pen();
        pen2.color = "black";
        pen2.type = "ballpoint";

        pen1.write();
        pen1.printColor();
        pen2.printColor();
        pen1.printType();
        pen2.printType();


        Student s1 = new Student();   //Student() is a constructor
        s1.name = "John";
        s1.age = 20;

        s1.printInfo();

        Student s2 = new Student("Sohini", 20);   //calling a parameterised constructor
        s2.printInfo();

        Student s3 = new Student(s1);   //copy constructor called
        s3.printInfo();
        
    }
}