package workbook3a.HashmapActivity;

import java.util.HashMap;

public class HashmapActivity {

    public static void main(String[] args) {

        HashMap<String, String> books = new HashMap<>();

        books.put("Art as Experience", "John Dewey");
        books.put("City of Bones", "Cassandra Clare");
        books.put("The Darkest Minds", "Alexandra Bracken");

        for (String title : books.keySet()) {
            System.out.println(title + " by " + books.get(title));
        }


        HashMap<String, Integer> inventory = new HashMap<>();

        inventory.put("Sword", 1);
        inventory.put("Potion", 5);
        inventory.put("Gold", 100);

        // for each item in the inventory keys, give me the value
        for (String item : inventory.keySet()) {
            System.out.println(item + ": " + inventory.get(item));
        }

        printInventory(inventory);
    }

    static void printInventory(HashMap<String, Integer> inventory) {
        for (String item : inventory.keySet()) {
            System.out.println(item + ": " + inventory.get(item));
        }
    }
}
