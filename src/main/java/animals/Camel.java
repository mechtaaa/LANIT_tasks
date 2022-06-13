package animals;

import food.Food;
import food.Grass;

public class Camel extends Herbivore implements Voice{
    @Override
    public void eat(Food food) {
        if(food instanceof Grass){
            System.out.println("Верблюд есть траву");
            satiety++;
        } else System.out.println("Верблюд не ест мясо");
    }


    @Override
    public String getVoice() {
        String getVoice = "Фыр";
        System.out.println(getVoice);

        return getVoice;
    }
}
