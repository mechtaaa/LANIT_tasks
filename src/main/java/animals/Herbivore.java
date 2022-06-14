package animals;

import food.Food;
import food.Grass;

public  abstract class Herbivore extends Animal {
    @Override
    public void eat(Food food) {
        if(food instanceof Grass){
            System.out.println(name + " ест траву");
            satiety++;
        } else System.out.println(name + " не ест мясо");
    }
}