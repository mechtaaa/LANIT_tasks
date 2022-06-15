package animals;

import food.Food;
import food.Grass;
import food.Meat;
import food.WrongFoodException;

public  abstract class Herbivore extends Animal {

    public Herbivore(String name) {
        super(name);
    }

    @Override
    public void eat(Food food)throws WrongFoodException {
        if(food instanceof Grass){
            System.out.println(name + " ест траву");
            satiety=satiety+getSatiety();
        } else System.out.println(name + " не ест мясо");
    }
}