package com.collections;

import java.util.HashMap;
import java.util.Map;

public class MapProgram {
    public static void main(String[] args) {
        Map<String, String> languages = new HashMap<>();
        if(languages.containsKey("Java")) {
            System.out.println("Java already present");
        } else {
            languages.put("Java", "a compiled langauge, OOPS");
            System.out.println("Adding Java");
        }
        languages.put("Python", "a interpreted langauge, OOPS");
        languages.put("Algo", "a algo language");
        languages.put("BASIC", "a Beginners all purpose System ");
        languages.put("Lisp", "Therein lies madness");
        if(languages.containsKey("Java")) {
            System.out.println("Java already present");
        } else {
            languages.put("Java", "a compiled langauge, OOPS");
            System.out.println("Adding Java");
        }
        System.out.println("====================================================");

        // Removes key and its value directly
        languages.remove("Algo");
        // Removes Key and value if both parameters key and value are same
        if(languages.remove("Lisp", "eudeuwnfr")) {
            System.out.println("Removed Lisp");
        } else {
            System.out.println("Incorrect key value pair");
        }

        // Replaces with last argument Key and value if both parameters key and value are same
        if(languages.replace("Lisp", "Therein lies madness",  "eudeuwnfr")) {
            System.out.println("Removed Lisp");
        } else {
            System.out.println("Incorrect key value pair");
        }

        for(String key: languages.keySet()) {
            System.out.println(key + " : " + languages.get(key));
        }
    }

}
