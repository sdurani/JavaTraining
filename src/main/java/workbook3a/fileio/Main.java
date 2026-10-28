package workbook3a.fileio;

//import java.io.*; // --> not as specific, but applies the library to all classes
import java.io.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Main {

    public static void main(String[] args) {
        System.out.println("Reading and writing files");
        try {
            // create a FileReader object connected to the file
                FileReader fileReader = new FileReader("poem.txt"); // the path of the file if not in the target folder

            // create a BufferedReader to manage the input stream
            BufferedReader bufReader = new BufferedReader(fileReader);
            // create a BufferedReader to manage the input stream
//            BufferedReader bufReader = new BufferedReader(new FileReader("poem.txt"));

            String input;

            // read until there is no more data
            // as long as its not empty KEEP writing --> the while line means
            while ((input = bufReader.readLine()) != null) {
                System.out.println(input);
                System.out.println("The next line");
            }

            // close the stream and release the resources
            bufReader.close();
        }
        catch (IOException e) {
            // display stack trace if there was an error
            e.printStackTrace();
        }

        try {
            // open the file (use new FileWriter("skills.txt", true) to append)
            FileWriter writer = new FileWriter("skills.txt");

            // write to the file
            writer.write(" 3 Reasons Why I Want to Become a Software Developer\n");
            writer.write("Create tech that makes a difference in people's lives.\n");
            writer.write("Coding allows me to be creative while solving problems.\n");
            writer.write("Money is good.\n");

            // close the file when you are finished using it
            writer.close();
        }
        catch (IOException e) {
            System.out.println("ERROR: An unexpected error occurred");
            e.printStackTrace();
        }

//        LocalDate today = LocalDate.now();
//        System.out.println("Today is: " + today);
//
//        try {
//            FileWriter writer = new FileWriter("myReasons-on-"
//                    + today.getDayOfWeek() + "-" + today.getDayOfMonth() +
//                    "-of-" + today.getMonth() + "-" + today.getYear() + ".txt");
//
//            writer.write(" 3 Reasons Why I Want to Become a Software Developer\n");
//            writer.write("Create tech that makes a difference in people's lives.\n");
//            writer.write("Coding allows me to be creative while solving problems.\n");
//            writer.write("Money is good.\n");
//
//            writer.close();
//        }
//        catch (IOException e) {
//            System.out.println("ERROR: An unexpected error occurred");
//            e.printStackTrace();
//        }


        LocalTime currentTime = LocalTime.now();
        System.out.println("The current time is: " + currentTime);

        LocalDateTime rightNow = LocalDateTime.now();
        System.out.println("Right now, it is: " + rightNow);



        LocalDate today = LocalDate.now();

        DateTimeFormatter renameFormat = DateTimeFormatter.ofPattern("yyyy-MM");

//        File folder = new File(today.getYear() + "-" + today.getMonthValue());
        // I like the top approach better ^^^
        File folder = new File(today.format(renameFormat));

        folder.mkdirs();

        File image = new File(folder, "zoom_screenshot.png");

        System.out.println(image.getPath());
    }
}

