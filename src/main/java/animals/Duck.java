package animals;


import food.Food;
import food.Grass;

public class Duck extends Herbivore implements Voice, Run, Swim, Fly{
    int satiety;

    public int getSatiety() {
        return satiety;
    }

    @Override
    public void eat(Food food) {
        if(food instanceof Grass){
            System.out.println("Утка ест траву");
        } else System.out.println("Утка не ест мясо");
    }

    @Override
    public String voice() {
        String voice = "Утка крякает";
        return voice;
    }

    @Override
    public void fly() {
        System.out.println("Утка летает");
    }

    @Override
    public void run() {
        System.out.println("Утка бежит");
    }

    @Override
    public String swim() {
        System.out.println("Утка плывёт");
        return null;
    }
}



