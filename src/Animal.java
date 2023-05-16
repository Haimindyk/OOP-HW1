abstract public class Animal {

    //state
    protected String liveIn;

    protected boolean mammals;
    protected boolean carnivorous;

    protected boolean frightened;


    //ctor

    public Animal() {
        this.mammals = mammals;
        this.carnivorous = carnivorous;
    }


    ///action

    abstract void greet();
    abstract void goodMood();
    abstract void badMood();



    public void setFrightened(boolean frightened) {
        this.frightened = frightened;
    }

    public boolean isMammals() {
        return mammals;
    }

    public boolean isCarnivorous() {
        return carnivorous;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "liveIn='" + liveIn + '\'' +
                ", mammals=" + mammals +
                ", carnivorous=" + carnivorous +
                ", frightened=" + frightened +
                '}';
    }
}



