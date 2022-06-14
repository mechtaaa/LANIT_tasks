package animals;

public class Hare extends Herbivore implements Run{
    public Hare(){
        this.name = "Заяц";
    }

    @Override
    public void run() {
        System.out.println("Заяц бежит");
    }
}