package com.aatish;

public class Main {

    public static void main(String[] args) {
        // Data with out encapsulation, All variables are defined with public and i can directly set values
        // from any other Class. Also if i change variable name i will have to change it everywhere. Also since
        // i am setting values from outside i can change it without any validations
        Player player = new Player();
        player.name = "Aatish";
        player.health = 100;
        player.weapon = "Gun";
//
//        player.loseHealth(10);
//        System.out.println("Reamining health: " + player.getHealth());

        // ENCAPSULATION - All variables will be mostly private. We will set values only from setters
        // or constructors. And we will get values from getters only. We will not allow other class to
        // modify data directly. Also in constructors we can set conditions to assign data and also
        // we are not accessing variables directly so variables names if changes will not empact entire program.
        EncpsulatedPlayer encapsulatedPlayed = new EncpsulatedPlayer("Lucky", 70, "Sword");
        encapsulatedPlayed.loseHealth(10);
        System.out.println("Remaining Health: "+ encapsulatedPlayed.getHealth());


        // Encapsulation Challenge
        Printer printer = new Printer("Lenovo300",70, true );
        printer.addPages(31);
        System.out.println("Pages " + printer.getPages());
        printer.setTonerPercentage(90);
        System.out.println("Toner Percentage " +  printer.getTonerPercentage() + "%");

    }
}
