package oop.hw1;


abstract public class Animal {

    //state
    private boolean isMammals;
    private boolean isCarnivorous;

    private String mood;





    //ctor
    public Animal(boolean isMammals ,boolean isCarnivorous) {
        this.isCarnivorous=isCarnivorous;
        this.isMammals=isMammals;
    }

    public abstract void sayHello();

    // set mood is only to Happy or Scare

    public void setMoodToHappy() {
        this.mood = "Happy";
    }

    public void setMoodToScare() {
        this.mood = "Scare";
    }

    //getters


    public String getMood() {
        return mood;
    }

    public boolean isMammals() {
        return isMammals;
    }

    public boolean isCarnivorous() {
        return isCarnivorous;
    }


    @Override
    public String toString() {
        return "isMammals=" + isMammals +
                ", isCarnivorous=" + isCarnivorous +
                ", Mood: " + mood +
                ", ";
    }
}











