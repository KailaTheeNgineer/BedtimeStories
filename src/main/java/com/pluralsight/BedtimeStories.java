package com.pluralsight;

import java.util.Scanner;
import java.io.*;

public class BedtimeStories {
    public static void main(String[] args) {
        System.out.println("Welcome to the Bedtime Story Reader!\n" +
                "To begin, Select a Bedtime Story");

        Scanner myScanner = new Scanner(System.in);


        try {
            System.out.println("[1] Goldilocks and the 3 Bears\n" +
                    "[2] Hansel and Gretel\n" +
                    "[3] Mary Had A Little Lamb");
            int bedtimeStory = myScanner.nextInt();
            FileInputStream goldi = new FileInputStream("src/main/resources/stories/goldilocks.txt");
            FileInputStream hansel = new FileInputStream("src/main/resources/stories/hansel_and_gretel.txt");
            FileInputStream mary = new FileInputStream("src/main/resources/stories/mary_had_a_little_lamb.txt");
            Scanner readGoldi = new Scanner(goldi);
            Scanner readHansel = new Scanner(hansel);
            Scanner readMary = new Scanner(mary);
            String input;
            if (bedtimeStory == 1) {
                while (readGoldi.hasNextLine()) {
                    input = readGoldi.nextLine();
                    System.out.println(input);
                }
                readGoldi.close();
            } else if (bedtimeStory == 2) {
                while (readHansel.hasNextLine()) {
                    input = readHansel.nextLine();
                    System.out.println(input);
                }
                readHansel.close();
            } else if (bedtimeStory == 3) {
                while (readMary.hasNextLine()) {
                    input = readMary.nextLine();
                    System.out.println(input);
                }
                readMary.close();
            }

        } catch (IOException e) {
            e.printStackTrace();

        }
    }

    }
