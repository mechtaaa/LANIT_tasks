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
    public void eat(Food food){
        try {
            if (food instanceof Grass) {
                throw new WrongFoodException("WrongFoodException");
            } else if (food instanceof Meat)
            System.out.println(name + " ест траву");
            satiety++;
        } catch (WrongFoodException e) {
            e.printStackTrace();
        }

    }
}