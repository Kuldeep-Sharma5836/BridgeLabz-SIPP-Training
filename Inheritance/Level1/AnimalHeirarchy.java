import java.util.*;
class Animal{
    public void makeSound() {
        System.out.println("Animal makes a sound");
    }
}
class dog extends Animal {
    //@Override
    public void makeSound() {
        System.out.println("Dog barks");
    }
}
class cat extends Animal {
    //@Override
    public void makeSound() {
        System.out.println("Cat meows");
    }
}
class bird extends Animal {
    //@Override
    public void makeSound() {
        System.out.println("Bird chirps");
    }
}
public class AnimalHeirarchy {
    public static void main(String[] args) {
        Animal animal = new Animal();
        dog d = new dog();
        cat c = new cat();
        bird b = new bird();
        animal.makeSound();
        d.makeSound();
        c.makeSound();
        b.makeSound();
    }
}
