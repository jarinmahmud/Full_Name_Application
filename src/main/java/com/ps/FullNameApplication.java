package com.ps;

import java.util.Scanner;

public class FullNameApplication {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please Enter your name");

        System.out.println("First Name: ");
        String firstName = scanner.nextLine().trim();

        System.out.println("Middle Name: ");
        String middleName = scanner.nextLine().trim();
        String displayedMName = "";
        if(!middleName.equals("")){
            displayedMName = " " + middleName.substring(0,1) + ".";;
        }

        System.out.println("Last Name: ");
        String lastName = scanner.nextLine().trim();

        System.out.println("Suffix: ");
        String suffix = scanner.nextLine().trim();
        String displayedSuffix = "";
        if(!suffix.equals("")){
            displayedSuffix = ", " + suffix;
        }


        System.out.printf("Full Name: %s%s%s%s ", firstName, displayedMName, lastName, displayedSuffix );
    }
}
