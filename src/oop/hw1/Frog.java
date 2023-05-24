package oop.hw1;

public class Frog extends Animal implements Land,Water,Mood {


    //state
    private int numOfLegs; //Represent the number of legs of frog


    //ctor
    public Frog() {
        super(false,false);
        this.numOfLegs=4;
    } //set isMammals and isCarnivorous to false and the number of legs to 4 for every frog without option to change


    //getters
    @Override
    public int getNumOfLegs() {
        return this.numOfLegs;
    } // Return the number of legs

    @Override
    public boolean hasLaysEggs() {
        return true;
    } ////Return if the object can lays eggs

    @Override
    public boolean hasGills() {
        return true;
    } ////Return if the object has gills


    //methods
    @Override
    public void sayHello() {
        System.out.println("nothing");
    } // Print what the frog say to welcome


    @Override
    public void actMood() {
        switch (mood) {
            case MOOD_HAPPY:
                System.out.println("Quack quack");
                break;
            case MOOD_SCARE:
                System.out.println("plop into the water");
                break;
            case NULL:
                System.out.println("I am not in a mood");
                break;
        }
    }//check the current mood of the frog and acts accordingly


    @Override
    public String toString() {
        return "Frog{" + super.toString()+
                "numOfLegs=" + numOfLegs +
                '}';
    }//Return Animal state and frog state
}
