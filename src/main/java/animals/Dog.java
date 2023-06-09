package animals;

import model.Size;

public class Dog extends Carnivorous implements Run,Swim, Voice{
    public Dog(String name){
        super(name);
    } // консруктор наследников вызывает консруктор базового класса.
    // public Animal(String name) { this.name = name;}

    @Override
    public void run() {
        System.out.println("Собака бежит");
    }

    @Override
    public String getVoice() {
        return "гав";
    }

    @Override
    public void swim() {
        System.out.println("Собака плывёт");
    }


    public Size getSize() {
        return Size.MEDIUM;
    }
}