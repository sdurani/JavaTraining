package workbook3a.BedtimeStories;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class BedtimeStories {

    static Scanner read = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Enter the name of a story: ");
        String storyName = read.nextLine();

        try {

            FileReader fileReader = new FileReader("src/main/resources/workbook3a/" + storyName);
            BufferedReader bufReader = new BufferedReader(fileReader);

            String line;
            int count = 1;

            while ((line = bufReader.readLine()) != null) {
                System.out.println(count + ". " + line);
                count++;
            }

            bufReader.close();

        } catch (IOException e) {
            System.out.println("ERROR: Story not found. Please try again.");
            e.printStackTrace();
        }
        read.close();
    }
}
