import java.util.*;
import bank;

//single level inheritence
class Shape{           //base class/parent class/super class
    public void area(){
        System.out.println("Displays area:");
    }
}

class Triangle extends Shape{      //derived class/child class/sub class
    public void area(int l, int h){
        System.out.println(1/2*l*h);
    }
    
}

//multi level inheritence
class EquilateralTriangle extends Shape{
    public void area(int l, int h){
        System.out.println(1/2*l*h);
    }
}

//hierarchical inheritence
class Square extends Shape{
    public void area(int l){
        System.out.println(l*l);
    }
}

class Circle extends Shape{
    public void area(int r){
        System.out.println(3.14*r*r);
    }
}


public class inheritence{
    public static void main(String[] args) {
        bank.Account acc1 = new bank.Account();
        acc1.name = "customer1";
    }
}