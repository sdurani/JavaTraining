package workbook3a.PayrollCalculator;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class PayrollCalculator {

    public static void main(String[] args) {

        try {
            BufferedReader bufReader = new BufferedReader(new FileReader("src/main/resources/workbook3a/employees.csv"));

            String line;

            // Skip the header line
            bufReader.readLine();

            while((line = bufReader.readLine()) != null) {
                // before splitting: id|name|hours-worked|pay-rate
                String[] employeeSplitParts = line.split("\\|");
                // after splitting: parts[0] = id, parts[1] = name, parts[2] = hours, parts[3] = pay rate
                int employeeId = Integer.parseInt(employeeSplitParts[0]);
                String employeeName = employeeSplitParts[1];
                double hoursWorked = Double.parseDouble(employeeSplitParts[2]);
                double payRate = Double.parseDouble(employeeSplitParts[3]);

                Employee employee = new Employee(employeeId, employeeName, hoursWorked, payRate);

                System.out.println("Employee #" + employee.getEmployeeId() + " " + employee.getName()
                        + "'s gross pay is " + employee.getGrossPay());
                System.out.printf("Employee #%d %s's gross pay is $%.2f%n",
                        employee.getEmployeeId(),
                        employee.getName(),
                        employee.getGrossPay());
            }
            bufReader.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

}
