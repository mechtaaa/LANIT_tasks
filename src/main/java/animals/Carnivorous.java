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
    public void eat(Food food){
        try {
            if (food instanceof Meat) {
                throw new WrongFoodException("WrongFoodException");
            } else if (food instanceof Grass)
                System.out.println(name + " ест мясо");
            satiety++;
        } catch (WrongFoodException e) {
            e.printStackTrace();
        }
    }
}