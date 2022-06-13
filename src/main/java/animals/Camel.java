package animals;

import food.Food;
import food.Grass;

public class Camel extends Herbivore implements Voice{
   int satiety;

    public int getSatiety() {
        return satiety;
    }

    @Override
    public void eat(Food food) {
        if(food instanceof Grass){
            System.out.println("Верблюд есть траву");
        } else System.out.println("Верблюд не ест мясо");
    }

    @Override
    public String voice() {
        String voice = "Бегемот: фыркает";
        return voice;
    }
}
