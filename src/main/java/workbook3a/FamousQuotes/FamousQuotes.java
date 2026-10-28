package workbook3a.FamousQuotes;

import java.util.ArrayList;
import java.util.Scanner;

public class FamousQuotes {

    static Scanner read = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<String> quotes = new ArrayList<>();

        quotes.add("Nothing in life is to be feared, it is only to be understood.");
        quotes.add("Still I'll rise.");
        quotes.add("The only tired I was, was tired of giving in.");
        quotes.add("Failure is impossible.");
        quotes.add("One can never consent to creep when one feels an impulse to soar.");
        quotes.add("The future belongs to those who believe in the beauty of their dreams.");
        quotes.add("All adventures, especially into new territory, are scary.");
        quotes.add("When I dare to be powerful, to use my strength in the service of my vision, then it becomes less important whether or not I am unafraid.");
        quotes.add("The most effective way to do it is to do it.");
        quotes.add("Fight for the things that you care about, but do it in a way that will lead others to join you.");


        int userSecondChoice = 0;

        do {
            try {
                System.out.println("Please select a number between 1 and 10.");
                int userChoice = read.nextInt();

                System.out.println(quotes.get(userChoice - 1));

                System.out.println("Would you like to see another quote? (1 for yes, 2 for no)");
                userSecondChoice = read.nextInt();
            }
            catch (Exception e) {
                System.out.println("ERROR: That number is out of range.");
                read.nextLine();
            }
        }
        while (userSecondChoice != 2);
    }
}
