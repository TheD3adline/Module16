package com.company;

import java.util.Locale;

public class Main {

    public static void main(String[] args) {

        // indexOf() gives the position of a char or "string" of characters within a String in INDEX numbers (starts with 0), you can + 1 to give in absolute numbers

        String test1 = "This is a test";

        System.out.println("indexOf()---------------------");
        System.out.println(test1.indexOf('s')); // searches for the first 's' in test1 String and prints it to console, 3
        System.out.println(test1.indexOf('s', 4)); // searches for the first 's' but starts after index 4, the first ' ', but counts from the start regardless, 6
        System.out.println(test1.indexOf("is")); // searches for the first string of "is" characters in test1 String and prints the position to console, 2, as it doesn't matter if the string of characters is part of a word or not
        System.out.println(test1.indexOf("is",4)); // searches for the first string of "is" characters but ignores all characters coming before index number 5, the second 'i', but counts from the first sign regardless, 5
        System.out.println("------------------------------");

        // lastIndexOf() gives the LAST position of a char or "string" of characters within a String in INDEX numbers (starts with 0), you can + 1 to give absolute numbers

        System.out.println("lastIndexOf()-----------------");
        System.out.println(test1.lastIndexOf('s')); // searches for the last 's' in test1 String  and prints it to console, 12
        System.out.println(test1.lastIndexOf('s', 4)); // searches for the last 's' in test1 String with index position 4 as a "cut off" point, 3
        System.out.println(test1.lastIndexOf("is")); // searches for the last string of "is" characters, 5
        System.out.println(test1.lastIndexOf("is", 4)); // searches for the last string of "is" characters with index position 4 as a "cut off" point
        System.out.println("------------------------------");

        // charAt() gives the character at the transferred index position

        System.out.println("charAt()----------------------");
        System.out.println(test1.charAt(8)); // prints the character at index position 8 of test1 String to console, 'a'
        System.out.println("------------------------------");

        // endsWith() returns a boolean if the test1 String ends with the transferred characters

        System.out.println("endsWith()--------------------");
        System.out.println(test1.endsWith("a test")); // searches the test1 String if it ends with "test" and returns a boolean, true
        System.out.println(test1.endsWith("test")); // searches the test1 String if it ends with "st" and returns a boolean, true
        System.out.println(test1.endsWith("st")); // searches the test1 String if it ends with "t" and returns a boolean, true
        System.out.println(test1.endsWith("tes")); // searches the test1 String if it ends with "tes" and returns a boolean, false
        System.out.println("------------------------------");

        // startsWith() returns a boolean if the test1 String starts with the transferred characters, opposite of endsWith() but with an additional function

        System.out.println("startsWith()------------------");
        System.out.println(test1.startsWith("This")); // searches the test1 String if it starts with "This" and returns a boolean, true
        System.out.println(test1.startsWith("his", 1)); // searches the test1 String if it starts with "his" but with the starting position index 1, true
        System.out.println(test1.startsWith("This", 1)); // searches the test1 String if it starts with "This" but with the starting position index 1, false
        System.out.println(test1.startsWith("his", 2)); // searches the test1 String if it starts with "his" but with the starting position index 2, false
        System.out.println("------------------------------");

        // isEmpty() returns a boolean true if the String is completely empty (yet initialised) or false if it is not, even a space " "

        String test2 = "";

        System.out.println("isEmpty()---------------------");
        System.out.println(test2.isEmpty()); // checks if the test2 String is empty, which it is, and returns true
        System.out.println(test1.isEmpty()); // checks if the test1 String is empty, which it is not and returns false
        System.out.println("------------------------------");

        // length() returns an integer with the number of characters within the String, in ABSOLUTE numbers

        System.out.println("length()----------------------");
        System.out.println(test1.length()); // counts the number of characters in test1 String, 14, and returns the integer to console
        System.out.println(test2.length()); // counts the number of characters in test2 String, 0, and returns the integer to console
        System.out.println("------------------------------");

        // substring() "cuts" a String out of test1 and returns it as another String

        System.out.println("substring()-------------------");
        System.out.println(test1.substring(5)); // cuts the string beginning with the index starting point 5 until end, INCLUDES index pos 5, "is a test"
        System.out.println(test1.substring(8, 13)); // cuts the string beginning with the index starting point 8 until index position 13, EXCLUDES index pos 13 as the endpoint, "a tes"
        System.out.println("------------------------------");

        // toLowerCase() everything so far has been case-sensitive, this method converts all characters in a String to lower case

        String test3 = "This IS another TEST";

        System.out.println("toLowerCase()-----------------");
        System.out.println(test3.toLowerCase()); // converts all characters in test3 String to their lower case version
        System.out.println(test3); // but doesn't change the actual String data of course
        System.out.println("------------------------------");

        // toUpperCase() opposite function of toLowerCase(), but other than that exactly the same

        System.out.println("toUpperCase()-----------------");
        System.out.println(test3.toUpperCase()); // converts all characters in test3 String to their upper case version
        System.out.println(test3); // but obviously also doesn't change the actual String data
        System.out.println("------------------------------");

        // trim() removes spaces ("     ") before and after other characters in a String

        String test4 = "     And yet another test     ";

        System.out.println("trim()------------------------");
        System.out.println(test4.trim()); // "trims" the "     " and "     " at the beginning and/or the end of the test4 String
        System.out.println(test4); // also doesn't alter the actual String data
        System.out.println("------------------------------");
    }
}
