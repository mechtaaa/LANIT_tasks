package animals;
import food.Food;
import food.Grass;
import food.Meat;
import food.WrongFoodException;

public abstract class Carnivorous extends Animal {

    public Carnivorous(String name) {
        super(name);} // консруктор наследников вызывает консруктор базового класса.
        // public Animal(String name) { this.name = name;}


    @Override
    public int eat(Food food) throws WrongFoodException{
            if (food instanceof Grass) {
                throw new WrongFoodException("WrongFoodException");
            } else if (food instanceof Meat)
                System.out.println(name + " ест мясо");
            satiety = satiety+food.getEnergy();
        return satiety;
    }
        }