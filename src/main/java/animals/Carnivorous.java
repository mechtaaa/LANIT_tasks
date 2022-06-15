package animals;
import food.Food;
import food.Grass;
import food.Meat;
import food.WrongFoodException;

public abstract class Carnivorous extends Animal {

    public Carnivorous(String name) {
        super(name);
    }

    @Override
    public int eat(Food food){
        try {
            if (food instanceof Grass) {
                throw new WrongFoodException("WrongFoodException");
            } else if (food instanceof Meat)
                System.out.println(name + " ест мясо");
            satiety++;
        } catch (WrongFoodException e) {
            e.printStackTrace();
        }
        return satiety;
    }
}