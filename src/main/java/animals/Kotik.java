package animals;

public class Kotik {
    private String name;
    private String voice;
    private int satiety;
    private int weight;
    private static int count;
    private static final int METHODS = 5;

    public Kotik() {
        count++;
    }

    public Kotik(String name, String voice, int satiety, int weight) {
        this.name = name;
        this.voice = voice;
        this.satiety = satiety;
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

    public int getSatiety() {
        return satiety;
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

    public void setSatiety(int satiety) {
        this.satiety = satiety;
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
    }

    private void eat() {
        eat(1, "Kitekat");
    }

    public String[] liveAnotherDay() {
        String[] result = new String[24];
        for (int n = 0; n < result.length; n++) {
            switch ((int) (Math.random() * METHODS) + 1) {
                case 1:
                    if (satiety > 0) {
                        System.out.println(n + " - играл");
                    } else {
                        eat();
                        System.out.println(n + " - ел");
                    }
                    break;
                case 2:
                    if (satiety > 0) {
                        System.out.println(n + " - спал");
                    } else {
                        eat(2);
                        System.out.println(n + " - ел");
                    }
                    break;
                case 3:
                    if (satiety > 0) {
                        System.out.println(n + " - мылся");
                    } else {
                        eat(3);
                        System.out.println(n + " - ел");
                    }
                    break;
                case 4:
                    if (satiety > 0) {
                        System.out.println(n + " - гулял");
                } else {
                    eat();
                        System.out.println(n + " - ел");
                }
                    break;
                case 5:
                    if (satiety > 0) {
                        System.out.println(n + " - охотился");
                    } else {
                        eat(-1);
                        System.out.println(n + " - ел");
                        satiety++;
                    }
                    break;
            }
        }
        return result;
    }
}