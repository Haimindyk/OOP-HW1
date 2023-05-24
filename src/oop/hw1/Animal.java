package oop.hw1;



abstract public class Animal {

    //state
    private boolean isMammals; // Define if the object is mammals
    private boolean isCarnivorous; // Define if the object is carnivorous
    protected MoodAnimal mood; // Define the mood of the object, the option is on enum MoodAnimal


    //ctor - isMammals and isCarnivorous are mandatory fields ,mood defined to null by default
    public Animal(boolean isMammals ,boolean isCarnivorous) {
        this.isCarnivorous=isCarnivorous;
        this.isMammals=isMammals;
        this.mood=MoodAnimal.NULL;
    }


    // Set MoodAnimal(Enum) to mood happy or mood scare
    public void setMoodHappy(){
        this.mood = MoodAnimal.MOOD_HAPPY;
    }

    public void setMoodScare(){
        this.mood= MoodAnimal.MOOD_SCARE;
    }



    //methods
    public abstract void sayHello(); // make the object say hello , abstract because every object say hello different


    @Override
    public String toString() {
        return "isMammals=" + isMammals +
                ", isCarnivorous=" + isCarnivorous +
                ", Mood: " + mood +
                ", ";
    }//toString -return the state of the animal state
}











