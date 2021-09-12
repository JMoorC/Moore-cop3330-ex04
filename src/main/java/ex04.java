/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 James Moore
 */

import java.util.Scanner;

public class ex04 {
    public static void main(String[] args){
        Scanner inScan = new Scanner(System.in);

        System.out.print("Enter a noun: ");
        String noun = inScan.nextLine();
        System.out.print("Enter a verb: ");
        String verb = inScan.nextLine();
        System.out.print("Enter an adjective: ");
        String adj = inScan.nextLine();
        System.out.print("Enter an adverb: ");
        String adverb = inScan.nextLine();

        System.out.printf("Do you %s your %s %s %s? That's hilarious!\n", verb, adj, noun, adverb);

    }
}
