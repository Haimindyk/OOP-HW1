public class Main {
    public static void main(String[] args) {


        Dog shocko = new Dog();
        shocko.greet();
        shocko.setFeelComfortable(true);
        shocko.setTouched(true);
        shocko.goodMood();
        shocko.setFrightened(true);
        shocko.setUpset(true);
        shocko.badMood();
        System.out.println(shocko);

        System.out.println("----");


        Cat loli = new Cat();
        loli.greet();
        loli.goodMood();
        loli.setFrightened(true);
        loli.badMood();
        System.out.println(loli);

        System.out.println("----");


        Frog klark = new Frog();
        klark.goodMood();
        klark.setFrightened(true);
        klark.badMood();
        System.out.println(klark);













    }

}
