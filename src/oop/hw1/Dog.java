package oop.hw1;

public class Dog extends Animal implements Land, Mood {


    //state
    private int numOfLegs; //Represent the number of legs of dog


    //ctor -set isMammals and isCarnivorous to true and the number of legs to 4 for every dog without option to change
    public Dog() {
        super(true,true);
        this.numOfLegs=4;

    }


    //methods
    @Override
    public void sayHello() {
        System.out.println("Dog: wagging tail");
    } // Print what the dog say to welcome


    @Override
    public int getNumOfLegs() {
        return this.numOfLegs;
    } // Return the number of legs


    @Override
    public void actMood() {
        switch (mood) {
            case MOOD_HAPPY:
                System.out.println("Bark loudly");
                break;
            case MOOD_SCARE:
                System.out.println("whoof");
                break;
            case NULL:
                System.out.println("I am not in a mood");
                break;
        }
    } //check the current mood of the dog and acts accordingly


    @Override
    public String toString() {
        return "Dog{" + super.toString() +
                "numOfLegs=" + numOfLegs +
                '}';
    } // Return Animal state and Dog state


}



















