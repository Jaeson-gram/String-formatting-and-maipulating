package com.Relearn;

import java.util.Locale;

public class Main {

    public static void main(String[] args) {
	// write your code here
        /*Escape Sequences
          \t - a new tab
          \n - a new line
          \" - double quotes, when you need it
          \\ - a backslash, when you need it
         */

        //Using Escape Sequences
        String bulletedText = "Printing a bulleted list:\n\t\u2022Java \n\t\u2022C# \n\t\t\u2022.net MAUI \n\t\u2022C";
        System.out.println(bulletedText);

        //Using the Text Block
        String anotherBulletedText = """
                A list of Languages I like:
                  \u2022English
                  \u2022Yoruba
                  \u2022Ekpeye
                  \u2022Java
                  \u2022C
                  \u2022C#
                  \u2022F#
                """;

        System.out.println(anotherBulletedText);

        //Formatting text we output -> System.out.printf() and System.out.format();
        int age = 23;
        System.out.printf("Your age is probably %d %n", age); //&n new line (This uses the platform specific new line, so it's preferred)

        int yearOfBirth = 2024 - age;
        System.out.printf("If today your age is %d, then you were born in the year %d %n", age, yearOfBirth);
        //we can also use the System.out.foramt() anywhere we can use the System.out.printf()

        System.out.printf("my age probably weighs %.1f kilos %n", (float) age);
        //the .[number] before the float formatter(f) is used to specify the decimal precision -> age.0 in this case

        for (long i = 1; i <= 100_000_000_000L; i *= 10){
            System.out.printf("printing.. %10d %n", i);
        }
        //the [number] before the number formatter(d) is used to specify the number -> 000001 in this case for any number that has enough space after it:
        //If the number has less zeros, it will be enough to be pushed further to give enough spaces (9 in our case) then begin on the specified column

        System.out.printf("%n");

        //These are other ways to format Strings...Since JDK 15
        String formattedString = String.format("Just to be clear, your age is %d right?", age);
        System.out.println(formattedString);
        formattedString = "Erm, for record purposes, if you're %d, then you were born in %d. Right?".formatted(age, yearOfBirth);
        System.out.println(formattedString);
        System.out.println();
        //OTHER STRING METHODS:
        /*We can split String's methods into 3
            *String Inspection Methods. - .length(), .charAt(), .indexOf()/.lastIndedOf(), isEmpty(), isBlank() etc...
            * Methods for comparing String Values
            * String Manipulation Methods
         */

        String password = "HOLYSPIRITandi";

        printInformation(password);
        printInformation("");
        printInformation("""

                         
                         """);
        //for the code block, enter is the only character it counts, not spaces -> \t
        printInformation("   ");


        //indexof()
        String helloWorld = "Hello World.";
        System.out.printf("index of . in '%s' = %d %n", helloWorld, helloWorld.indexOf('.'));
        System.out.printf("index of ld in %s = %d %n", helloWorld, helloWorld.indexOf("ld"));
        System.out.printf("index of l in %s = %d %n", helloWorld, helloWorld.indexOf("l"));
        System.out.printf("last index of l in %s = %d %n", helloWorld, helloWorld.lastIndexOf("l"));

        System.out.printf("second index of l in %s = %d %n", helloWorld, helloWorld.indexOf("l", 3)); //searches this way ->
        System.out.printf("second index, from the last index of l in %s = %d %n", helloWorld, helloWorld.lastIndexOf("l", 8)); //searches this way <-

        //in the real world, to use this approach, we can first get the first and last, then search for the next. In case you were wondering...


        //Methods for comparing String Values
        System.out.println();
        String helloWorldLower = helloWorld.toLowerCase();

        if (helloWorld.equals(helloWorldLower))
            System.out.println("values match exactly!");

        if (helloWorld.equalsIgnoreCase(helloWorldLower))
            System.out.println("values match, ignoring case.");

        if (helloWorld.startsWith("Hello"))
            System.out.println("String starts with 'Hello'");

        if (helloWorld.endsWith("World."))
            System.out.println("String ends with 'World.'");

        if (helloWorld.contains("."))
            System.out.println("String contains '.'");

        if (helloWorld.contentEquals("Hello World."))
            System.out.println("String is 'Hello World.'");

        /*
         *For the record, the .contentEquals() is slightly different from the .Equals()method;
         * It can also perform its operation on the stringBuilder class.
         */


    }


    //String Inspection Methods
    public static void printInformation(String string){
        int length = string.length();
        System.out.printf("Length = %d %n", length);

        if (string.isEmpty()){
            System.out.println("String is empty");
            return;
        }
        if (string.isBlank()){
            System.out.println("String is blank");
        }
        System.out.printf("First character = %c %n", string.charAt(0));
        System.out.printf("Last character = %c %n", string.charAt(length - 1));

        System.out.printf("%n");
    }


}
