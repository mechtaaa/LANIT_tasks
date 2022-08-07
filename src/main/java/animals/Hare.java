package animals;

import model.Size;

public class Hare extends Herbivore implements Run{
    public Hare(String name){
        super(name);
    } // консруктор наследников вызывает консруктор базового класса.
    // public Animal(String name) { this.name = name;}

    @Override
    public void run() {
        System.out.println("Заяц бежит");
    }

    public Size getSize() {
        return Size.MEDIUM;
    }
}