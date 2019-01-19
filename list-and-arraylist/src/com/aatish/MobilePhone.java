package com.aatish;

import java.util.ArrayList;

public class MobilePhone {
    private String myNumber;
    private ArrayList<Contact> myContact;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContact = new ArrayList<Contact>();
    }

    public boolean addNewContact(Contact contact) {
        if(findContact(contact.getName()) >=0) {
            System.out.println("Contact Already exists");
            return false;
        }
        myContact.add(contact);
        return true;
    }

    public boolean updateContact(Contact oldContact, Contact newContact) {
        int position = findContact(oldContact);
        if(position >= 0) {
            System.out.println("Contact not found");
            return false;
        } else if(findContact(newContact.getName()) != -1) {
            System.out.println("Contact with following contact already exists");
            return false;
        }
        this.myContact.set(position, newContact);
        System.out.println("Contact updated");
        return true;
    }

    private int findContact(Contact contact) {
        return this.myContact.indexOf((contact));
    }

    private int findContact(String contactName) {
        for(int i=0; i<myContact.size(); i++) {
            Contact contact = this.myContact.get(i);
            if(contact.getName().equals(contactName)) {
                return i;
            }
        }
        return  -1;
    }

    public String queryContact(Contact contact) {
        if(findContact(contact) >= 0) {
            return contact.getName();
        }
        return null;
    }

    public boolean removeContact(Contact contact) {
        int position = findContact(contact);
        if(position < 0) {
            System.out.println("Contact not found");
            return false;
        }
        this.myContact.remove(position);
        System.out.println("Contact was deleted");
        return true;
    }


    public Contact queryContact(String name) {
        int position = findContact(name);
        if(position >=0) {
            return this.myContact.get(position);
        }

        return null;
    }

    public void printContacts() {
        System.out.println("Contact List");
        for(int i=0; i<this.myContact.size(); i++) {
            System.out.println((i+1) + "." +
                    this.myContact.get(i).getName() + " -> " +
                    this.myContact.get(i).getNumber());
        }

    }
}
