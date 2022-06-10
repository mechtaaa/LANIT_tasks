import animals.Kotik;

public class Application {
    public static void main(String[] args ) {
        Kotik cat1 = new Kotik("Pushok", "meow", 3 , 10);
        Kotik cat2 = new Kotik();
        cat2.setName("Tim");
        cat2.setVoice("myr");
        cat2.setSatiety(3);
        cat2.setWeight(8);
        cat1.liveAnotherDay();
        for(String action: cat1.liveAnotherDay()){
            System.out.println(action);
        }
        System.out.println(cat2.getName()+" " + cat2.getWeight());

        compareVoice(cat1, cat2);
        System.out.println("Колличество котиков " + Kotik.getCount());
    }

    private static void compareVoice(Kotik cat1, Kotik cat2) {
        System.out.println(cat1.getVoice().equals(cat2.getVoice()));
    }
}