package oop.hw1;

public class Main {
    public static void main(String[] args) {

        Dog shocko = new Dog();
        Cat micki = new Cat();
        Frog klark = new Frog();

        System.out.println("Dog -Shocko:");
        shocko.sayHello();
        shocko.actMood();
        shocko.setMoodScare();
        shocko.actMood();
        shocko.setMoodHappy();
        shocko.actMood();
        System.out.println(shocko.getNumOfLegs());
        System.out.println();

        System.out.println("Cat -Micki:");
        micki.sayHello();
        micki.actMood();
        micki.setMoodScare();
        micki.actMood();
        micki.setMoodHappy();
        micki.actMood();
        System.out.println(micki.getNumOfLegs());
        System.out.println();

        System.out.println("Frog -Klark:");
        klark.sayHello();
        klark.actMood();
        klark.setMoodScare();
        klark.actMood();
        klark.setMoodHappy();
        klark.actMood();
        System.out.println(klark.getNumOfLegs());
        System.out.println(klark.hasGills());
        System.out.println(klark.hasLaysEggs());


    }
}