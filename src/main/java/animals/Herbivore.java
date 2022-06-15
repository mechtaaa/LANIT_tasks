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
    public int eat(Food food)throws WrongFoodException {
            if (food instanceof Grass) {
            } else if (food instanceof Meat)
                System.out.println(name + " ест траву");
            satiety = satiety + food.getEnergy();
        return satiety;
    }
    }