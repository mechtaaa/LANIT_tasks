import animals.*;
import employee.Worker;
import food.Grass;
import food.Meat;
import food.WrongFoodException;
import model.Aviary;
import model.Size;

public class Zoo {


    public static void main(String[] args) throws WrongFoodException {
        Camel camel = new Camel("Верблюд");
        Dog dog = new Dog("Собака");
        Duck duck = new Duck("Утка");
        Fish fish = new Fish("Рыба");
        Hare hare = new Hare("Заяц");
        Kotik kotik = new Kotik("Котик");
        Grass grass = new Grass();
        Meat meat = new Meat();
        Worker worker = new Worker();

        camel.eat(grass);
        dog.eat(meat);
        duck.eat(meat);
        fish.eat(grass);
        kotik.eat(grass);
        worker.getVoice(duck);
        worker.getVoice(dog);
        worker.getVoice(camel);
        duck.fly();
        hare.run();

        for(Swim i : createPond()){
            i.swim();
        }
        fillCarnivorousAviary();

    }
    public static Swim[]  createPond(){
        Swim[] swim = new Swim [4];
        swim[0] = new Dog("собака");
        swim[1] = new Kotik("котик");
        swim[2] = new Duck("утка");
        swim[3] = new Fish("рыба");
        return swim;

    }
    private static Aviary<Carnivorous> carnivorousAviary = new Aviary<>(Size.SMALL); //вальер для плотоядных маленького размера
    private static Aviary<Herbivore> herbivoreAviary = new Aviary<>(Size.MEDIUM); // вальер травоядных маленького разщмера
    public static void fillCarnivorousAviary(){  // создает некоторое количество объектов хищников и добавляет их в вольер carnivorousAviary.
        Kotik kotik = new Kotik("Пушок");
        Dog dog = new Dog("Мухтар");
        Fish fish = new Fish("Нэмо");
        carnivorousAviary.addAnimal(fish);
    }
    public static void  fillHerbivoreAviary(){ // аналогично с травоядными
        Duck duck = new Duck ("Утя");
        Hare hare = new Hare ("Зая");

        herbivoreAviary.addAnimal(hare);
    }

    public static Carnivorous getCarnivorous(String name){
       return carnivorousAviary.getAnimal(name);
    }

    public static Herbivore getHerbivore(String name){
       return herbivoreAviary.getAnimal(name);
    }
}