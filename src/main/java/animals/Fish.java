package animals;

import food.Food;
import food.Meat;

public class Fish extends Carnivorous implements Swim{
    int satiety;

    public int getSatiety() {
        return satiety;
    }

    @Override
    public void eat(Food food) {
        if(food instanceof Meat){
            System.out.println("Рыба ест мясо");
        } else System.out.println("Рыба не ест траву");
    }

    @Override
    public String swim() {
        System.out.println("Рыба плывёт");
        return null;
    }
}
