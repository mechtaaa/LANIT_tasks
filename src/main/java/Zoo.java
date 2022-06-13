import animals.*;
import employee.Worker;
import food.Grass;
import food.Meat;

public class Zoo {
    public static void main(String[] args){
        Zoo zoo = new Zoo();
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
        worker.getVoice(duck);
        worker.getVoice(kotik);
        worker.getVoice(dog);

        duck.fly();
        dog.run();
        hare.run();

        String[] pond = new String[4];
        pond[0] = dog.swim();
        pond[1] = duck.swim();
        pond[2] = kotik.swim();
        pond[3] = fish.swim();

        zoo.createPond();

    }
    public String[] createPond(){
        String[] pond = new String[4];
           return pond;
    }
}