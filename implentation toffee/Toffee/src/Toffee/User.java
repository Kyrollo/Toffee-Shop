package Toffee;

import java.util.Scanner ;

/**
 * Represents a user in the shop.
 *  *  * @author mahmoud sayed abdalaty
 *  *  * kirolos osama adip
 *  *  * kirolos mansour
 */
public class User {
    Scanner in = new Scanner(System.in);
    /**
     * Displays the menu with item details and prices.
     */


    public static void displayMenu() {
        System.out.println("-------------<Menu>-------------");
        System.out.println("Item #1                  Item #2");
        System.out.println("120 L.E.                115 L.E.");
        System.out.println();
        System.out.println("Item #3                  Item #4");
        System.out.println("519 L.E.                220 L.E.");
        System.out.println();
        System.out.println("Item #5                  Item #6");
        System.out.println("1910 L.E.               141 L.E.");
    }

    /**
     * Constructs a new User instance and prompts the user for options.
     */

    User() {
        Scanner in = new Scanner(System.in);
        System.out.println("Welcome to our shop -_- ");
        System.out.println("Choose one option of the following please:");
        System.out.println("1- Display the menu");
        System.out.println("2- Register");
        System.out.println("3- Exit");
        int option;
        option = in.nextInt();
        switch (option) {
            case 1 : {
                displayMenu();
                System.out.println("User constructor finished");
            }
            case 2 : {
                new MemberUser();
            }
            default : System.out.println("Invalid option");
        }
    }
}