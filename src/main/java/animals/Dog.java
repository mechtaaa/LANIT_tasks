package animals;

import food.Food;
import food.Meat;


public class Dog extends Carnivorous implements Run,Swim, Voice{
    @Override
    public void eat(Food food) {
        if(food instanceof Meat){
            System.out.println("Cобака ест мясо");
            satiety++;
        } else System.out.println("Собака не ест траву");
    }
    @Override
    public void run() {
        System.out.println("Собака бежит");
    }

    @Override
    public String getVoice() {
        String getVoice = "Гав";
        System.out.println(getVoice);
        return getVoice;
    }

    @Override
    public void swim() {
        System.out.println("Собака плывёт");
    }
}