package animals;

import food.Food;

public abstract class Animal {
    protected String name;
    public abstract void eat(Food food);
    public int getSatiety() {
        return satiety;
    }
    int satiety;
}