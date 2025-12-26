package com.learnjava;
import java.util.Scanner;
import java.util.ArrayList;

public class Beginner {
    public static void run(Scanner sc) {
        ArrayList<ArrayList<String>> table = new ArrayList<>();

        char Continue;

        while(true){
            System.out.print("Type 'c' to continue your journey or 'b' to go back to the menu: ");
            Continue = sc.nextLine().charAt(0);

            if(Continue == 'c'){
                System.out.println("\nAwesome! Now we can begin learning about the Fundamentals of Java.\n");
            }
            else if(Continue == 'b'){
                System.out.println("Returing to main menu...");
                Menu.mainmenu(sc);
            }
            break;
        }
        System.out.println("📖Chapter 1: Data Types, Variables, and Arrays");
        System.out.println("---------------------------------------------\n");

        System.out.println("This chapter examines the three of Java's most fundamental elements: data types,\n" +
                "variables, and arrays. As with all modern programming languages, Java supports several types\n" +
                "of data. You may use these types to declare variables and to create arrays. As you will see,\n" +
                "Java's approach to these items is clean, efficient, and cohesive.\n");

        System.out.println("The Primitive Types");
        System.out.println("-----------------------\n");
        System.out.println("Java defines eight primitive types of data: byte, short, int, long, char, float, double\n" +
                "and boolean. The primitive types are also commonly referred to as simple types, and both terms will\n" +
                "be used in this book. These can be put in four groups:\n");

        System.out.println("Integers: This group includes 'byte', 'short', 'int', and 'long', which are for whole-valued\n" +
                "signed numbers.\n");
        System.out.println("Floating-point numbers: This group includes 'float' and 'double', which represent numbers with\n" +
                "fractional precision.\n");
        System.out.println("Characters: This group includes 'char', which represent symbols in a character set, like letters\n" +
                "and numbers.\n");
        System.out.println("Boolean: This group includes 'boolean', which is a special type for representing true/false\n" +
                "values.\n");

        System.out.println("QUIZ 1\n");

        while(true){
            System.out.println("Which group includes 'float' and 'double'?\n");
            System.out.println("a) Characters\n" +
                               "b) Integers\n" +
                               "c) Floating-Point Numbers\n" +
                               "d) Boolean\n");
            System.out.print("Enter (a, b, c, d): ");
            char Answer1 = sc.nextLine().charAt(0);

            switch(Answer1){
                case 'a' :
                    System.out.println("\n❌Characters contain 'char', which represents symbols in character set.\n");
                    System.out.println("    Try Again\n");
                    break;

                case 'b':
                    System.out.println("\n❌Integers contain 'byte', 'short', 'int', and 'long', which are for whole-valued\n");
                    System.out.println("  Try Again\n");
                    break;

                case 'c':
                    System.out.println("\n✅CORRECT! Floating-Point Numbers include 'float' and 'double', which represent\n" +
                            "numbers with fractional precision.\n");
                    break;

                case 'd':
                    System.out.println("\n❌Booleans are just true/false values.\n");
                    System.out.println("    Try Again\n");
                     break;

                default:
                    System.out.println("\nInvalid Input\n");
                    System.out.println("Try Again\n");
            }
            if(Answer1 == 'c'){
                break;
            }
        }
        System.out.print("Press 'c' to continue: ");
        char continue2 = sc.nextLine().charAt(0);


        while(continue2 == 'c'){
            System.out.println("\nJava has primitive data types, which are the most basic kinds of data you can use.\n" +
                    "You can use them directly, put them in arrays, or build your own classes with them.\n" +
                    "\n" +
                    "Primitive types store only one simple value (like a number or a true/false).\n" +
                    "They are not objects, even though most of Java is object-oriented.\n" +
                    "This is done for speed and efficiency—making them objects would slow programs down.\n" +
                    "\n" +
                    "Each primitive type in Java has a fixed size and range.\n" +
                    "For example, an int is always 32 bits, no matter what computer you use.\n" +
                    "\n" +
                    "This is different from languages like C or C++, where sizes can change depending on the system.\n" +
                    "Java keeps sizes fixed so programs can run the same way on every machine, which helps with portability.");
            break;
        }
        System.out.println("\nNow let's look at each type of data in turn.\n");
        System.out.print("Press 'c' to continue: ");
        char continue3 = sc.nextLine().charAt(0);

        while(continue3 == 'c'){
            System.out.println("\nINTEGERS");
            System.out.print("-------------------------------------------------------------------------\n");

            //Creating the rows for the table
            ArrayList<String> row1 = new ArrayList<>();
            row1.add("Name");
            row1.add("Width");
            row1.add("Range                                                   |");

            ArrayList<String> row2 = new ArrayList<>();
            row2.add("Long |");
            row2.add("64  |");
            row2.add("-9,223,372,036,854,775,808 to 9,223,372,036,854,775,807 |");

            ArrayList<String> row3 = new ArrayList<>();
            row3.add("int  |");
            row3.add("32  |");
            row3.add("-2,147,483,648 to 2,147,483,647                         |");

            ArrayList<String> row4 = new ArrayList<>();
            row4.add("short|");
            row4.add("16  |");
            row4.add("–32,768 to 32,767                                       |");

            ArrayList<String> row5 = new ArrayList<>();
            row5.add("Byte |");
            row5.add("8   |");
            row5.add("-128 to 127                                             |");

            //adding the rows to the table
            table.add(row1);
            table.add(row2);
            table.add(row3);
            table.add(row4);
            table.add(row5);

            //creating the table using nested-loops
            for(int i = 0; i < table.size(); i++){
                for(int j = 0; j < table.get(i).size(); j++){
                    System.out.print(table.get(i).get(j) + "\t");
                }
                System.out.println();
            }
            System.out.print("-------------------------------------------------------------------------\n");
            break;
        }




    }
}
