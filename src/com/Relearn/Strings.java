package com.Relearn;

import java.lang.annotation.Documented;

public class Strings {
    public static void main(String[] args) {
        String about = "Ahoada, Rivers, Nigeria, Africa, Earth";

        int planetIndex = about.indexOf("Earth");
        System.out.println("Lives in the planet " + about.substring(planetIndex));
        //cuts a substring from a point like so -> [starting index]

        int continentIndex = about.indexOf("Africa");
        System.out.printf("Lives in the continent %s %n", about.substring(continentIndex, 31));
        //cuts a substring from a point like so -> [starting index, ending index]

        int nationIndex = about.indexOf("Nigeria");
        System.out.printf("Lives in the continent %s", about.substring(nationIndex, 31));

        int stateIndex = about.indexOf("Rivers");
        System.out.printf("Lives in the continent %s %n", about.substring(stateIndex, 31));

        int townIndex = about.indexOf("Rivers");
        System.out.printf("Lives in the continent %s %n", about.substring(townIndex, 31));

        //JOINS
        String _continent = about.substring(planetIndex, 38);
        String _planet = about.substring(continentIndex, 31);
        String _nation = about.substring(nationIndex, 23);
        String _state = about.substring(stateIndex, 14);
        String _town = about.substring(0, 6);


        String introduceInterContinental = String.join("  - \t", _continent, _planet, _nation, _state, _town);
        //cuts a substring from a point like so -> [delimiter, elements]
        System.out.println(introduceInterContinental);

        //CONCAT
        String newone = _town.concat(" - " + _state).concat(" - " +_nation);
        //Inefficient. Each call creates a new String object.
        // By the way, this method of combining methods is called Method Chaining... they're all Strings so it works...

        //REPLACE
        System.out.println(introduceInterContinental.replace('a', 'A'));
        System.out.println(introduceInterContinental.replace("Ahoada", "A_Town"));
        //Replaces a string like so replace[target, replacement]

        System.out.println(introduceInterContinental.replaceFirst("-", "--")); //replaces the first occurrence of the target
        System.out.println(introduceInterContinental.replaceAll("-", "--"));   //replaces all occurrences of the target
        //Replaces a string like so replace[regex, replacement] ---> use the replace() instead of replaceAll to replace all occurrences

        //REPEAT AND INDENT, to repeat and add indentations - or remove them,..
        System.out.println("abc\n".repeat(3));
        System.out.println("-".repeat(3));
        //Repeats a string for a specified number of times like so -> [string].repeat(number of times);

        System.out.println("abc\n".repeat(3));
        System.out.println("-".repeat(3).indent(6));
        //...    -> [string].repeat(number of times).indent(how many spaces);

        System.out.println("     abc\n".repeat(3).indent(-3));
        //...    -> [string].repeat(number of times).indent(how many spaces - can be negative too);
        System.out.println("-".repeat(3));





    }
}
