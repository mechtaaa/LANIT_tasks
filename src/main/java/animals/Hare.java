package animals;

import food.Food;
import food.Grass;

public class Hare extends Herbivore implements Run{
    int satiety;

    public int getSatiety() {
        return satiety;
    }

    @Override
    public void eat(Food food) {
        if(food instanceof Grass){
            System.out.println("Заяц ест траву");
        } else System.out.println("Заяц не ест мясо");
    }

    @Override
    public void run() {
        System.out.println("Заяц бежит");
    }
}