/** 
* Java 1. HomeWork - 6
*
* @author Pavel Pulyk
* @version 22.11.2021
*/

class HomeWork6 {

    public static void main(String[] args) {
        Dog dog = new Dog("Arti", 500, 10);
            System.out.println(dog);
            dog.run(400);
            dog.swim(5);

        Cat cat = new Cat("Timon", 200, 0);
            System.out.println(cat);
            cat.run(150);
            cat.swim(5);
        /*
        IAnimal[] animals = {dog, cat};
            for (IAnimal animal : animals) { 
                System.out.println(animal);
                System.out.println(animal.run());
                System.out.println(animal.swim());
            } */ 
    }
}    

interface IAnimal {
    void run(int distance);
    void swim(int distance);
}    

abstract class Animal implements IAnimal {
    protected String name;
    protected int runDistance;
    protected int swimDistance;

    Animal(String name, int runDistance, int swimDistance) {
        this.name = name;
        this.runDistance = runDistance;
        this.swimDistance = swimDistance;
    }

    @Override 
    public String toString() { 
        return name;    
    }
}

class Dog extends Animal {

    Dog(String name, int runDistance, int swimDistance) {
        super(name, runDistance, swimDistance);
    }

    @Override
    public void run(int distance) {
        if ((distance >= 0) && (distance <= runDistance)) {  
            System.out.println("run: " + distance + " m.");
        }
        else { 
            System.out.println("run: could not run ");
        }
    }
    
    @Override
    public void swim(int distance) {
        if ((distance >= 0) && (distance <= swimDistance)) {
            System.out.println("swim: " + distance + " m.");
        }    
        else {
            System.out.println("swim: could not swim");
        }
    }       
}

class Cat extends Animal {

    Cat(String name, int runDistance, int swimDistance) {
        super(name, runDistance, swimDistance);
    }

    @Override
    public void run(int distance) {
        if ((distance >= 0) && (distance <= runDistance)) {
            System.out.println("run: " + distance + " m.");
        } 
        else {
            System.out.println("run: could not run ");
        }
    }

    @Override
    public void swim(int distance) {
        System.out.println("swim: can't swim ");
    }
}

