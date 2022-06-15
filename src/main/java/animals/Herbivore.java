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
    public int eat(Food food){
        try {
            if (food instanceof Meat) {
                throw new WrongFoodException("WrongFoodException");
            } else if (food instanceof Grass)
            System.out.println(name + " ест траву");
            satiety = satiety+food.getEnergy();
        } catch (WrongFoodException e) {
            e.printStackTrace();
        }

        return satiety;
    }
}