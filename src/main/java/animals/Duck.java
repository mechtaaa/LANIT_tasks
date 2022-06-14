package animals;

public class Duck extends Herbivore implements Voice, Run, Swim, Fly{
    public Duck(){
        this.name = "Утка";
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
        String getVoice = "Кря";
        System.out.println(getVoice);
        return getVoice;
    }

    @Override
    public void swim() {
        System.out.println("Утка плывёт");
    }
}



