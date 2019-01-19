package com.aatish;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        // Basic example of Linked List and looping Iterator using iterator.
        LinkedList<String> placesToVisit = new LinkedList<String>();
        placesToVisit.add("New Delhi");
        placesToVisit.add("KanyaKumari");
        placesToVisit.add("PondiCherry");
        placesToVisit.add("Goa");
        placesToVisit.add("Mumbai");
        placesToVisit.add("Shimla");
        placesToVisit.add("Chandigarh");
        printPlacesToVisit(placesToVisit);
//        // Adding values to Linked List basic
        placesToVisit.add(2, "Gokarna");
        printPlacesToVisit(placesToVisit);
//
//        placesToVisit.remove(1);
//        printPlacesToVisit(placesToVisit);

        // Example to show how we can use linked list to add values.
        LinkedList<String> placesToSee = new LinkedList<String>();
        addToOrder(placesToSee, "New Delhi");
        addToOrder(placesToSee,"KanyaKumari");
        addToOrder(placesToSee,"PondiCherry");
        addToOrder(placesToSee,"Goa");
        addToOrder(placesToSee,"Mumbai");
        addToOrder(placesToSee, "Shimla");
        addToOrder(placesToSee,"Chandigarh");
        printPlacesToVisit(placesToSee);

        visit(placesToVisit);
    }
    private static void printPlacesToVisit(LinkedList<String> linklist) {
        Iterator<String> i= linklist.iterator();
        while (i.hasNext()) {
            System.out.println("Now Visiting " + i.next());
        }
        System.out.println("===================================");
    }

    // Function to arrange Values in LinkedList in ascending order
    private static boolean addToOrder(LinkedList<String> linkList, String newCity) {
        ListIterator<String> stringListIterator = linkList.listIterator();

        while (stringListIterator.hasNext()) {
            int comparison = stringListIterator.next().compareTo(newCity);
            // if comparison value is 0 it means newCity to be added already exists
            if(comparison == 0) {
                System.out.println(newCity + " Already Present");
                return false;
            } else if(comparison > 0) {
                stringListIterator.previous();
                stringListIterator.add(newCity);
                return true;
            } else if(comparison < 0 ) {
                // do nothing as new city is larger than prevoius and move to next city
            }
            // if comparison value come > 0 it means it is smaller than current city but since we have gone to
            // next city we have to come back to previous city ad than add it.
            // if comparsion value ot smaller than 0 it means it is value is greater than previous value so
            // we need to move forward
            // if return executes that means newCity is highest hence we need to add it in end.
        }

        linkList.add(newCity);
        return true;
    }

    private static void visit(LinkedList cities) {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean goingForward = true;
        ListIterator<String> listIterator = cities.listIterator();

        if(cities.isEmpty()) {
            System.out.println("No cities in the itenerary");
            return;
        } else {
            System.out.println("Now visiting " + listIterator.next());
            printMenu();
        }

        while (!quit) {
            int action = scanner.nextInt();
            scanner.nextLine();
            switch(action) {
                case 0:
                    System.out.println("Holiday (Vacation) over");
                    quit = true;
                    break;

                case 1:
                    if(!goingForward) {
                        if(listIterator.hasNext()) {
                            listIterator.next();
                        }
                        goingForward = true;
                    }
                    if(listIterator.hasNext()) {
                        System.out.println("Now visiting " + listIterator.next());
                    } else {
                        System.out.println("Reached the end of the list");
                        goingForward = false;
                    }
                    break;

                case 2:
                    if(goingForward) {
                        if(listIterator.hasPrevious()) {
                            listIterator.previous();
                        }
                        goingForward = false;
                    }
                    if(listIterator.hasPrevious()) {
                        System.out.println("Now visiting " + listIterator.previous());
                    } else {
                        System.out.println("We are at the start of the list");
                        goingForward = true;
                    }
                    break;

                case 3:
                    printMenu();
                    break;

            }

        }
    }

    private static void printMenu() {
        System.out.println("Available actions:\npress ");
        System.out.println("0 - to quit\n" +
                "1 - go to next city\n" +
                "2 - go to previous city\n" +
                "3 - print menu options");
    }

}
