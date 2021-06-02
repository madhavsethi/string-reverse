package com.company;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the text::");
        char[] charArray = scanner.nextLine().trim().toCharArray();
        int charLength = charArray.length;
        System.out.println("The length is::" + charLength);

        for (int i = 0; i < charLength; i++) {
            System.out.print(charArray[i]);
        }
        System.out.println("");
        System.out.println("********************");

        for (int y = charLength - 1; y >= 0; y--) {
            System.out.print(charArray[y]);
        }
    }

}