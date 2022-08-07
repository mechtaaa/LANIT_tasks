package animals;

import food.Food;
import food.WrongFoodException;
import model.Size;

public abstract class Animal {
    String name;
    public String getName() {
        return name;
    }
    public Animal(String name){
        this.name=name;
    }

    public abstract int eat(Food food) throws WrongFoodException;
    public int getSatiety() {
        return satiety;
    }
    int satiety;

    public abstract Size getSize();
}