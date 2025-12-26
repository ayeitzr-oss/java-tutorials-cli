package com.learnjava;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        mainmenu(sc);
        sc.close();
    }

    public static void mainmenu(Scanner sc){

        //Title Card
        System.out.println("                 ---------------------------------             ");
        System.out.println("                    Welcome to Java Tutorials 💻       ️      ");
        System.out.println("                 ---------------------------------            \n");

        //askes the user for their experience with java
        while(true){
            System.out.print("What is your experience level with Java? (Beginner, Intermediate, Expert): ");
            String experience = sc.nextLine();
            System.out.println("---------------------------------------------------------------------------");

            if(experience.equalsIgnoreCase("Beginner")){
                System.out.println("That's awesome! Since you're a beginner, we will start with\n" +
                        "basic fundamentals of java. By the end of the this course, you \nshould" +
                        " be able to write a small program on your own.\n");
                Beginner.run(sc);
                return;
            }
            else if(experience.equalsIgnoreCase("Intermediate")){
                System.out.println("Great! Since you're an intermediate java developer, we won't\n" +
                        "spend much time on the basic fundamentals of java, but we will review them\n" +
                        "a little so you get a nice refresher before moving on to more advanced\n" +
                        "concepts.\n");
                Intermediate.run(sc);
                return;
            };
        }

    }
}
