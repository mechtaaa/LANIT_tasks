package animals;


import food.Food;
import food.Grass;

public class Duck extends Herbivore implements Voice, Run, Swim, Fly{

    @Override
    public void eat(Food food) {
        if(food instanceof Grass){
            System.out.println("Утка ест траву");
            satiety++;
        } else System.out.println("Утка не ест мясо");
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
    public String getVoice() {
        String getVoice = "Кря";
        System.out.println(getVoice);
        return getVoice;
    }

    @Override
    public void swim() {
        System.out.println("Утка плывёт");
    }
}



