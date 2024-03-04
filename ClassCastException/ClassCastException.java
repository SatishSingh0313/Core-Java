
class Animal {
    public void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    public void bark() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    public void meow() {
        System.out.println("Cat meows");
    }
}

public class ClassCastException {
	 public static void main(String[] args) {
	        Animal animal = new Animal();
	        Dog dog = (Dog) animal; // This line throws a ClassCastException
	        dog.bark();
	    }
 }

