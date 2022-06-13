package employee;

import animals.Animal;
import food.Food;

public class Worker {

    public void feed(Animal animal, Food food){
       animal.eat(food);

    }
    public Animal getVoice(Animal animal) {
        System.out.println(animal.voice());
        return animal;
    }
}