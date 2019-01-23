package com.aatish;

public class Main {

    public static void main(String[] args) {
	    Dog dog = new Dog("Imli");
	    dog.eat();
	    dog.breathe();

	    Parrot parrot = new Parrot("Australian ringneck");
	    parrot.fly();
	    parrot.breathe();
	    parrot.eat();

        Penguin penguin = new Penguin("Emperor");
        penguin.fly();
        penguin.breathe();
        penguin.eat();
    }
}
