package animals;

import model.Size;

public class Camel extends Herbivore implements Voice{
    public Camel(String name){
        super(name);
    }

    @Override
    public String getVoice() {
        return "фыр";
    }

    public Size getSize() {
        return Size.LARGE;
    }
}
