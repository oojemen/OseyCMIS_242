package dev.cmis;
/* @author Osey Ojemen
 * Date: 4/10/2023
 *
 * Project; Media Rental System
 *
 * A Program designed and implemented to demonstrate media hierarchy
 *
 */

import java.io.FileNotFoundException;
import java.util.Scanner;

//import java.util.Scanner;
import java.io.IOException;
import java.util.*;



//package umgc.cmis;

public class MyLauncher {

    public static String createSecretCode(String s) {
        StringBuilder secretCode = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isLetter(c)) {
                if (Character.isUpperCase(c)) {
                    secretCode.append((char) ('Z' - (c - 'A')));
                } else {
                    secretCode.append((char) ('z' - (c - 'a')));
                }
            } else {
                secretCode.append(c);
            }
        }

        return secretCode.toString();
    }

    // DO NOT TOUCH THE CODE BELOW
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        sc.close();
        System.out.println(createSecretCode(s));
    }
}


//import dev.cmis.models.Manager;



/*
public class MediaRentalSystem {

    public static void main(String[] args) throws FileNotFoundException {
        String directoryPath="C:/tmp-umuc";

        List<Media>list= createMediaFiles();

    }
}

 */