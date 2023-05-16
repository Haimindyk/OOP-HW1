public class Dog extends Animal{

    private boolean feelComfortable;
    private  boolean isTouched;
    private boolean upset;




    public Dog() {
        super();
        this.mammals =true;
        this.carnivorous =true;
        this.liveIn = "land";
    }

    @Override
    void greet() {
        System.out.println("Dog: wagging tail");
    }

    @Override
    void goodMood() {
        this.feelComfortable=feelComfortable;
        this.isTouched=isTouched;
        if (feelComfortable == true && isTouched == true){
            bark();
        }else {
            System.out.println("Dog: I am not in good mood");
        }
    }

    @Override
    void badMood() {
        this.frightened=frightened;
        if(frightened ==true && upset ==true) {
            System.out.println("Whoop");
        }else {
            System.out.println("Dog: I am not in bad mood");
        }
    }


    public void setFeelComfortable(boolean feelComfortable) {
        this.feelComfortable = feelComfortable;
    }

    public void setTouched(boolean touched) {
        isTouched = touched;
    }

    public void setUpset(boolean upset) {
        this.upset = upset;
    }

    void bark(){
        System.out.println("Dog: bark loudly");

        }

    @Override
    public String toString() {
        return  super.toString()+ "Dog{" +
                "feelComfortable=" + feelComfortable +
                ", isTouched=" + isTouched +
                '}';
    }
}






