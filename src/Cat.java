public class Cat extends Animal {

    public Cat() {
        super();
        this.mammals=true;
        this.carnivorous=true;
        this.liveIn = "land";
    }

    @Override
    void greet() {
        System.out.println("meow");
    }

    @Override
    void goodMood() {
        System.out.println("purrr");

    }

    @Override
    void badMood() {
        this.frightened=frightened;
        if (frightened==true) {
            System.out.println("hiessss");
        }else {
            System.out.println("Cat : I am not in bad mood");
        }
    }


    @Override
    public String toString() {
        return super.toString() +" Cat {" +
                "frightened=" + frightened +
                '}';
    }
}
