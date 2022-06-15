package animals;
import food.Food;
import food.Meat;
import food.WrongFoodException;

public abstract class Carnivorous extends Animal {

    public Carnivorous(String name) {
        super(name);
    }

    @Override
    public void eat(Food food)throws  WrongFoodException{
        if(food instanceof Meat){
            System.out.println(name + " ест мясо");
            satiety=satiety+food.getEnergy();
        } else System.out.println(name + " не ест траву");
    }
}