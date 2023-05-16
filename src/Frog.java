public class Frog extends Animal{

    public Frog() {
        super();
        this.mammals=false;
        this.carnivorous=false;
        this.liveIn = "land and water";
    }

    @Override
    void greet() {
    }

    @Override
    void goodMood() {
        System.out.println("quack quack");

    }

    @Override
    void badMood() {
        this.frightened=frightened;
        if (frightened==true) {
            System.out.println("plop into the water");
        }else {
            System.out.println("Frog : I am not i bad mood");
        }
    }

    @Override
    public String toString() {
        return super.toString() +" Frog {" +
                "frightened=" + frightened +
                '}';
    }
}
