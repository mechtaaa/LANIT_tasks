package animals;

public class Dog extends Carnivorous implements Run,Swim, Voice{
    public Dog(){
        this.name = "Собака";
    }

    @Override
    public void run() {
        System.out.println("Собака бежит");
    }

    @Override
    public String getVoice() {
        String getVoice = "Гав";
        System.out.println(getVoice);
        return getVoice;
    }

    @Override
    public void swim() {
        System.out.println("Собака плывёт");
    }
}