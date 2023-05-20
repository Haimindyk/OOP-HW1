package oop.hw1;

public class Main {
    public static void main(String[] args) {

        Dog shocko = new Dog();
        Cat micki = new Cat();
        Frog klark = new Frog();


        shocko.sayHello();
        shocko.setMoodToHappy();
        shocko.actHappy();
        shocko.actScared();
        System.out.println(shocko);

        System.out.println("___________");

        klark.sayHello();
        klark.setMoodToHappy();
        klark.actHappy();
        klark.setMoodToScare();
        klark.actScared();
        System.out.println(klark);

        System.out.println("___________");

        micki.sayHello();
        micki.setMoodToHappy();
        micki.actHappy();
        micki.setMoodToScare();
        System.out.println(micki);


















    }

}