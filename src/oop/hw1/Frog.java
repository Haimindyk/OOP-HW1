package oop.hw1;

public class Frog extends Animal implements Land,Water,Mood {

    private int numOfLegs;

    public Frog() {
        super(false,false);
        this.numOfLegs=4;
    }

    @Override
    public void sayHello() {
        System.out.println("");
    }



    @Override
    public int getNumOfLegs() {
        return this.numOfLegs;
    }

    @Override
    public boolean hasLaysEggs() {
        return true;
    }

    @Override
    public boolean hasGills() {
        return true;
    }


    @Override
    public void actHappy() {
        if(getMood() == "Happy")
        System.out.println("Quack quack");
        else
            System.out.println("Not in a mood");
    }

    @Override
    public void actScared() {
        if (getMood() == "Scared")
        System.out.println("plop into the water");
        else
            System.out.println("Not in a mood");
    }

    @Override
    public String toString() {
        return "Frog{" + super.toString()+
                "numOfLegs=" + numOfLegs +
                '}';
    }
}
