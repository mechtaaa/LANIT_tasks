package animals;

public class Camel extends Herbivore implements Voice{
    public Camel(){
        this.name = "Верблюд";
    }

    @Override
    public String getVoice() {
        String getVoice = "Фыр";
        System.out.println(getVoice);

        return getVoice;
    }
}
