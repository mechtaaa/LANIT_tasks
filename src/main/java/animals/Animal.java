package animals;

import food.Food;

public abstract class Animal {
    public abstract void eat(Food food);
    public int getSatiety() {
        return satiety;
    }
    int satiety;
}