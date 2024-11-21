import Two.Rectangle;
import Two.Shape;
import Two.Triangle;

public class Main {
    public static void main(String[] args) {

      //Overriding
        System.out.println("===== Overriding =====");
        Car object = new Ford();
        System.out.println(object.speedLimit());
        System.out.println();

        Animal animal = new Animal();
        Dog dog = new Dog();
        Pig pig = new Pig();
        animal.animalSound();
        dog.animalSound();
        pig.animalSound();

        //Overloading
        System.out.println("\n"+"===== Overloading =====");
        Sum sumObject = new Sum();
        System.out.println(sumObject.add(20,30));
        System.out.println(sumObject.add(10,20,30));

        //Package Two
        System.out.println("\n"+"===== Package Two =====");
        Shape s1 = new Rectangle("red",4,5);
        System.out.println(s1.hello());
        System.out.println("area "+s1.getArea());

        Shape s2 = new Triangle("blue",7,12);
        System.out.println(s2);
        System.out.println("area "+s2.getArea());

        //Upcasting
        System.out.println("\n"+"===== Upcasting =====");
        Animal animal1 = new Dog();
        animal1.animalSound();
        Animal animal2 = new Pig();
        animal2.animalSound();

        //Down-casting
        System.out.println("\n"+"===== Down-casting =====");
        Animal animal3 = new Dog();
        Dog dog1 = (Dog) animal3;
        dog1.animalSound();
        
        Pig pig1 = (Pig) animal2;
        pig1.animalSound();
    }
}