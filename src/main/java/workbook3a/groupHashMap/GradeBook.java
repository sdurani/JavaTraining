package workbook3a.groupHashMap;
import java.util.HashMap;

public class GradeBook {

    // put(key, value) --> adds an item. Keys are unique: putting an existing key replaces its value.
    // get(key) --> returns the value, or null if the key isn't there.
    // remove(key) --> removes one item; clear() removes all items.
    // values() and keySet() --> let you loop over the values or the keys.

        public static void main(String[] args) {

            // Create a HashMap and add grades
            // note: keys must be objects, so use Integer instead of int
            HashMap<String, Integer> grades = new HashMap<>();

            grades.put("Sama", 95);
            grades.put("Will", 88);
            grades.put("Ron", 92);

            System.out.println(grades);

            // Retrieve and update grades
            System.out.println("Sama's grade: " + grades.get("Sama"));

            grades.replace("Will", 98);

            // Remove a student
            grades.remove("Ron");

            // Display all remaining students
            for (String student : grades.keySet()) {
                System.out.println(student + ": " + grades.get(student));
            }

            // Display only the grades
            for (Integer grade : grades.values()) {
                System.out.println(grade);
            }
        }
}

