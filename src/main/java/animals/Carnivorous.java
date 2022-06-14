package animals;
import food.Food;
import food.Meat;

public abstract class Carnivorous extends Animal {

@Override
    public void eat(Food food){
        if(food instanceof Meat){
            System.out.println(name + " ест мясо");
            satiety++;
        } else System.out.println(name + " не ест траву");
    }
}