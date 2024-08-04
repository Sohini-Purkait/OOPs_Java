interface Animal{
    public void walk();
}

interface Herbivore{
    
}
 
class Horse implements Animal, Herbivore{
    public void walk(){
        System.out.println("Walks on 4 legs");
    }
}

public class interFace{
    public static void main(String[] args) {
        Horse horse = new Horse();
        horse.walk();
    }
}