abstract class Animal{
    abstract void walk();  
    Animal(){
        System.out.println("Animal is created");
    }
    public void eat(){
        System.out.println("Animal eats");
    }
}

class Horse extends Animal{
    Horse(){
        System.out.println("Horse is created");
    }
    public void walk(){
        System.out.println("Walks on 4 legs");
    }
}

class Chicken extends Animal{
    public void walk(){
        System.out.println("Walks on 2 legs");
    }
}

public class abstraction {
    public static void main(String[] args) {
        Horse horse = new Horse();
        horse.walk();
        horse.eat();

        Animal animal = new Animal(); //Run time Error: Animal is abstract; cannot be instantiated
        animal.walk();
    }
}