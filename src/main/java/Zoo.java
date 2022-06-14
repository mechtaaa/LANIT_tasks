import animals.*;
import employee.Worker;
import food.Grass;
import food.Meat;

public class Zoo {


    public static void main(String[] args){
        Camel camel = new Camel();
        Dog dog = new Dog();
        Duck duck = new Duck();
        Fish fish = new Fish();
        Hare hare = new Hare();
        Kotik kotik = new Kotik();

        Grass grass = new Grass();
        Meat meat = new Meat();

        Worker worker = new Worker();

        worker.feed(camel, grass);
        worker.feed(dog, meat);
        worker.feed(duck, meat);
        worker.feed(fish, grass);
        worker.feed(kotik, grass);
        worker.getVoice(duck);
        worker.getVoice(dog);
        worker.getVoice(camel);

        duck.fly();
        dog.run();
        hare.run();

        Swim[] swim = new Swim[4];
        swim[0]=dog;
        swim[1]=kotik;
        swim[2]=duck;
        swim[3]=fish;
        for(int i = 0;i<swim.length; i++){
            swim[i].swim();
        }
        Zoo.createPond();
    }
    public static Swim[]  createPond(){
        return new Swim[4];
    }
}