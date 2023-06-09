package animals;
import model.Size;

public class Kotik extends Carnivorous implements Swim, Run, Voice {
    private String name;
    private String voice;
    private int weight;
    private static int count;
    private static final int METHODS = 5;

    public Kotik(String name) {
        super(name); // консруктор наследников вызывает консруктор базового класса.
        // public Animal(String name) { this.name = name;}
        count++;
    }

    public Kotik(String name, String voice,int satiety, int weight) {
        this(name);
        this.name = name;
        this.satiety=satiety;
        this.voice = voice;
        this.weight = weight;
        count++;
    }

    public static int getCount() {
        return count;
    }

    public String getName() {
        return name;
    }

    public String getVoice() {
        return voice;
    }

    public int getWeight() {
        return weight;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setVoice(String voice) {
        this.voice = voice;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    private boolean play() {
        if (satiety > 0) {
            System.out.println("Котик играет");
            satiety--;
            return true;
        }
        System.out.println("Котик просит есть");
        return false;
    }

    private boolean sleep() {
        if (satiety > 0) {
            System.out.println("Котик спит");
            satiety--;
            return true;
        }
        System.out.println("Котик просит есть");
        return false;
    }

    private boolean wash() {
        if (satiety > 0) {
            System.out.println("Котик умывается");
            satiety--;
            return true;
        }
        System.out.println("Котик просит есть");
        return false;
    }

    private boolean walk() {
        if (satiety > 0) {
            System.out.println("Котик просит есть");
            satiety--;
            return true;
        }
        System.out.println("Котик гуляет");
        return false;
    }

    private boolean hunt() {
        if (satiety > 0) {
            System.out.println("Котик охотится");
            satiety--;
            return true;
        }
        System.out.println("Котик просит есть");
        return false;
    }

    private void eat(int satiety) {
        this.satiety += satiety;
    }

    private void eat(int satiety, String foodName) {
        this.satiety += satiety;
    }

    public void eat() {
        eat(satiety, "Kitekat");
    }

    public String[] liveAnotherDay() {
        String[] result = new String[24];
        for (int n = 0; n < result.length; n++) {
            switch ((int) (Math.random() * METHODS) + 1) {
                case 1:
                    if (play()) {
                        result[n] = n + " - Играл";
                    } else {
                        eat();
                        result[n] = n + " - Ел";
                    }
                    break;
                case 2:
                    if (sleep()) {
                        result[n] = n + " - Спал";
                    } else {
                        eat(2);
                        result[n] = n + " - Ел";
                    }
                    break;
                case 3:
                    if (wash()) {
                        result[n] = n + " - Мылся";
                    } else {
                        eat();
                        result[n] = n + " - Ел";
                    }
                    break;
                case 4:
                    if (walk()) {
                        result[n] = n + " - Гулял";
                    } else {
                        eat();
                        result[n] = n + " - Ел";
                    }
                    break;
                case 5:
                    if (hunt()) {
                        result[n] = n + " - Охотился";
                    } else {
                        eat(3);
                        result[n] = n + " - Ел";
                    }
                    break;
            }
        }
        return result;
    }

    public Size getSize() {
        return Size.SMALL;
    }

    @Override
    public void run() {
        System.out.println("Котик бежит");
    }


    @Override
    public void swim() {
        System.out.println("Котик плывёт");
    }
}