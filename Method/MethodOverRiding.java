
class Animal {
    public void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Dog Barks");
    }
}

class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Cat Meows");
    }
}

public class MethodOverRiding {
	public static void main(String[] args) {
		Animal animal = new Animal();
		animal.makeSound(); 

		Dog dog = new Dog();
		dog.makeSound(); 

		Cat cat = new Cat();
		cat.makeSound(); 

	}

}
