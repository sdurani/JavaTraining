package workbook3a.PayrollCalculator;

import java.io.*;
import java.util.Scanner;

public class PayrollCalculator {

    static Scanner read = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Enter the name of the employee file to process: ");
        String inputFileName = read.nextLine().trim();

        System.out.println("Enter the name of the payroll file to create: ");
        String outputFileName = read.nextLine().trim();



        try {
            BufferedReader bufReader = new BufferedReader(new FileReader("src/main/resources/workbook3a/" + inputFileName));
            BufferedWriter bufWriter = new BufferedWriter(new FileWriter(outputFileName));

            String line;

            // Skip the header line
            bufReader.readLine();
            bufWriter.write("id|name|gross pay\n");

            while((line = bufReader.readLine()) != null) {
                // before splitting: id|name|hours-worked|pay-rate
                String[] employeeSplitParts = line.split("\\|");
                // after splitting: parts[0] = id, parts[1] = name, parts[2] = hours, parts[3] = pay rate
                int employeeId = Integer.parseInt(employeeSplitParts[0]);
                String employeeName = employeeSplitParts[1];
                double hoursWorked = Double.parseDouble(employeeSplitParts[2]);
                double payRate = Double.parseDouble(employeeSplitParts[3]);

                Employee employee = new Employee(employeeId, employeeName, hoursWorked, payRate);

                // Print the payroll information. (Exercise Part 1)
//                System.out.println("Employee #" + employee.getEmployeeId() + " " + employee.getName()
//                        + "'s gross pay is " + employee.getGrossPay());
//                System.out.printf("Employee #%d %s's gross pay is $%.2f%n",
//                        employee.getEmployeeId(),
//                        employee.getName(),
//                        employee.getGrossPay());
                String payrollText = String.format("%d|%s|%.2f%n",
                        employeeId,
                        employeeName,
                        employee.getGrossPay());
                bufWriter.write(payrollText);
            }
            bufReader.close();
            bufWriter.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
