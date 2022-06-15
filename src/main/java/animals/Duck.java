package animals;

import model.Size;

public class Duck extends Herbivore implements Voice, Run, Swim, Fly{
    public Duck(String name){
        super(name);
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
        return "кря";
    }

    @Override
    public void swim() {
        System.out.println("Утка плывёт");
    }


    public Size getSize() {
        return Size.SMALL;
    }
}

















