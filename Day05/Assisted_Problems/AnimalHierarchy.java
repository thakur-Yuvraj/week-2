

// Animal class as super class holding some basic properties
class Animal {
    // Attributes
    public String name;
    public int age;

    // Displaying the sound of animals
    public void makeSound() {
        System.out.println("Different animals make different sounds!!");
    }
}

// Dog class extending the properties of Animal class
class Dog extends Animal {
    // Attributes
    public String name = "Doggy1";
    public int age = 12;

    // makeSound() method is overridden
    @Override
    public void makeSound() {
        System.out.println("Dog make sound of bhau-bhau...");
    }
}

// Dog class extending the properties of Animal class
class Cat extends Animal {
    // Attributes
    public String name = "cat1";
    public int age = 11;

    // makeSound() method is overridden
    @Override
    public void makeSound() {
        System.out.println("Cat make sound of meau-meau...");
    }
}

// Bird class extending the properties of Animal class
class Bird extends Animal {
    // Attributes
    public String name = "crow";
    public int age = 4;

    // makeSound() method is overridden
    @Override
    public void makeSound() {
        System.out.println("Crow make sound of cau-cau...");
    }
}

public class AnimalHierarchy {
    public static void main(String[] args) {
        // Dog object created and displayed the name and sound
        Dog doggy1 = new Dog();
        System.out.println("Name of the dog is: " + doggy1.name);
        doggy1.makeSound();

        // Cat class object created and displayed the sound
        Cat cat1 = new Cat();
        System.out.println("Name of the cat is: " + cat1.name);
        cat1.makeSound();

        // bird class object created and displayed the sound
        Bird crow = new Bird();
        System.out.println("Name of the bird is: " + crow.name);
        crow.makeSound();
    }
}