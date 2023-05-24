package oop.hw1;

public class Cat extends Animal implements Land,Mood {

    //state
    private int numOfLegs; //Represent the number of legs of cat


    //ctor
    public Cat() {
        super(true,true);
        this.numOfLegs=4;
    } //set isMammals and isCarnivorous to true and the number of legs to 4 for every cat without option to change


    //methods
    @Override
    public void sayHello() {
        System.out.println("meow");

    } // Print what the cat say to welcome


    @Override
    public int getNumOfLegs() {
        return this.numOfLegs;
    } // Return the number of legs


    @Override
    public void actMood() {
        switch (mood) {
            case MOOD_HAPPY:
                System.out.println("purr purr");
                break;
            case MOOD_SCARE:
                System.out.println("hissss");
                break;
            case NULL:
                System.out.println("I am not in a mood");
                break;
        }
    } //check the current mood of the cat and acts accordingly

    @Override
    public String toString() {
        return "Cat{" + super.toString()+
                "numOfLegs=" + numOfLegs +
                '}';
    } // Return Animal state and cat state

}



