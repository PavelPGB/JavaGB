/** 
* Java 1. HomeWork - 7
*
* @author Pavel Pulyk
* @version 0.0.2 01.12.2021
*/

class HomeWork7 {
    public static void main(String[] args) {
        Cat[] cats = {new Cat("Timon", 15), new Cat("Arti", 10), new Cat("Murchik", 20)};
        Plate plate = new Plate(50, 30);
        System.out.println(plate);
        
        for (Cat cat : cats) {
            cat.eat(plate);
            System.out.println(cat);
        }

            System.out.println(plate);
            plate.addFood(40);
            System.out.println(plate);

        for (Cat cat : cats) {
            cat.setSatiety(false);
            cat.eat(plate);
            System.out.println(cat);  
        }
        System.out.println(plate);
    }
}

class Cat { 
    protected String name;
    protected int appetite;
    protected boolean satiety; 
    
    Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        satiety = false; 
    }
 
    void setSatiety(boolean status) {
        satiety = status;
    }
    
    void eat(Plate plate) {
        if (!satiety)
            satiety = plate.decreaseFood(appetite);
    }

    /* еще один ваиант реализации метода eat
    void eat(Plate plate) { 
        if (!satiety) {
            satiety = false;
        }
        if (satiety = plate.decreaseFood(appetite)) {
            satiety = true;
        }
    }*/
    
    @Override
    public String toString() {
        return "name: " + name + ", appetite: " + appetite + ", satiety: " + satiety;
    }
}

class Plate {   
    protected int food;   
    protected int additive;

    Plate(int additive, int food) { 
        this.additive = additive; 
        this.food = food;   
    }
 
    boolean decreaseFood(int portion) {
        if (food < portion) return false;
        food -= portion;
        return true;
    }

    /* еще один вариант реализации метода decreaseFood
    boolean decreaseFood(int n) { 
        if ((food - n) < 0) {  
            return false;
        }
            food -= n; {    
            return true;
        }    
    }*/

    void addFood(int food) {
        if (this.food + food <= additive)
            this.food += food;
    }

    @Override
    public String toString() {
        return "plate: " + food;
    }
}

