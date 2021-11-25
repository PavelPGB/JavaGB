/** 
* Java 1. HomeWork - 7
*
* @author Pavel Pulyk
* @version 25.11.2021
*/

class HomeWork7 {
    public static void main(String[] args) {
        Cat[] cats = {new Cat("Timon", 8), new Cat("Arti", 3), new Cat("Murchik", 2)};
        Plate plate = new Plate(10, 5);
        
        for (Cat cat : cats) {
            cat.eat(plate);
            plate.addFood(3);
            System.out.println(cat);
            System.out.println(plate);
        }
    }
}

class Cat { 
    protected String name;
    protected int appetite;
    protected boolean satiety; 
    
    Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = satiety; 
    }
 
    void eat(Plate plate) { 
        if (!satiety) {
            satiety = false;
        }
        if (satiety = plate.decreaseFood(appetite)) {
            satiety = true;
        }
    }

    @Override
    public String toString() {
        return "name: " + name + ", appetite: " + appetite + ", satiety: " + satiety;
    }
}

class Plate {   
    protected int food;   
    protected int additive;

    Plate(int food , int additive) { 
        this.food = food; 
        this.additive = additive; 
    }
 
    void addFood(int food) {  
        if (food <= additive)               
            food += food;
    }

    boolean decreaseFood(int n) {  
        if ((food - n) < 0) {  
            return false;
        }
            food -= n; {    
            return true;
        }    
    }

    @Override
    public String toString() {
        return "plate: " + food;
    }
}

