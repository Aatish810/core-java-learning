package com.aatish;
import java.util.Scanner;
public class Main {

   // public static void main(String[] args) {
	    // Four types of nested classes in Java
        // Static nested classes
        // Non Static nested classes - inner classes
        // Local classes - Inner class defined in a scope block
        // Anonymous nested class - class defined without a name

        // When inner class is public we can access it by following method
//        GearBox gearBox = new GearBox(6);
//        GearBox.Gear gear = gearBox.new Gear(2, 50.00);
        // Everytime we  need to access inner class we will have to create new instance of outer class than we can
        // access inner class from outer class new instance

        // When public is changed to private we cannot access inner class so following changes are required


        private static Scanner scanner = new Scanner(System.in);
        private static Button btnPrint = new Button("Print");

        public static void main(String[] args) {

//        class ClickListener implements Button.OnClickListener {
//            public ClickListener() {
//                System.out.println("I've been attached");
//            }
//
//            @Override
//            public void onClick(String title) {
//                System.out.println(title + " was clicked");
//            }
//        }
//
//        btnPrint.setOnClickListener(new ClickListener());
            btnPrint.setOnClickListener(new Button.OnClickListener() {
                @Override
                public void onClick(String title) {
                    System.out.println(title + " was clicked");
                }
            });
            listen();
        }

        private static void listen() {
            boolean quit = false;
            while(!quit) {
                int choice = scanner.nextInt();
                scanner.nextLine();
                switch(choice) {
                    case 0:
                        quit = true;
                        break;
                    case 1:
                        btnPrint.onClick();

                }
            }
        }
  //  }
}
