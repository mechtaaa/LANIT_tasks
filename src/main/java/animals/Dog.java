package animals;

import food.Food;
import food.Meat;


public class Dog extends Carnivorous implements Run,Swim, Voice{
    int satiety;

    public int getSatiety() {
        return satiety;
    }

    @Override
    public void eat(Food food) {
        if(food instanceof Meat){
            System.out.println("Cобака ест мясо");
        } else System.out.println("Собака не ест траву");
    }

    @Override
    public String voice() {
        String voice = "Собака лает";
        return voice;
    }

    @Override
    public void run() {
        System.out.println("Собака бежит");
    }

    @Override
    public String swim() {
        String swim = "Cобака плывёт";
        System.out.println(swim);
        return swim;
    }
}