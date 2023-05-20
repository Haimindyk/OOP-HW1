package oop.hw1;


public class Dog extends Animal implements Land, Mood {

    private int numOfLegs;


    public Dog() {
        super(true,true);
        this.numOfLegs=4;
    }

    @Override
    public void sayHello() {
        System.out.println("Dog: wagging tail");
    }



    @Override
    public int getNumOfLegs() {
        return this.numOfLegs;
    }

    @Override
    public void actHappy() {
        if (getMood() == "Happy") {
            System.out.println("bark loudly");
        }else
            System.out.println("Not in a mood");
    }

    @Override
    public void actScared() {
        if (getMood() == "Scared") {
            System.out.println("whoof");
        }else
            System.out.println("Not in a mood");
    }

    @Override
    public String toString() {
        return "Dog{" + super.toString() +
                "numOfLegs=" + numOfLegs +
                '}';
    }
}


















