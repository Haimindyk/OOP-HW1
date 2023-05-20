package oop.hw1;

public class Cat extends Animal implements Land,Mood {

    private int numOfLegs;


    public Cat() {
        super(true,true);
        this.numOfLegs=4;
    }

    @Override
    public void sayHello() {
        System.out.println("meow");

    }


    @Override
    public int getNumOfLegs() {
        return this.numOfLegs=4;
    }


    @Override
    public void actHappy() {
        if (getMood() == "Happy"){
        System.out.println("purr purr");
        }
        else
            System.out.println("Not in a mood");
    }

    @Override
    public void actScared() {
        if (getMood() == "Scared"){
        System.out.println("hissss");
        setMoodToScare();
        }else
            System.out.println("Not in a mood");
    }

    @Override
    public String toString() {
        return "Cat{" + super.toString()+
                "numOfLegs=" + numOfLegs +
                '}';
    }
}



