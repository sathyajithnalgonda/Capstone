package com.java;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Prescription {
    private int prescID;  // Unique ID for the prescription
    private String firstName;  // Patient's first name
    private String lastName;   // Patient's last name
    private String address;    // Patient's address (must be at least 20 characters)
    private float sphere;      // Spherical correction value (-20.00 to +20.00)
    private float axis;        // Axis value (0 to 180)
    private float cylinder;    // Cylindrical correction value (-4.00 to +4.00)
    private Date examinationDate;  // Date of the eye examination
    private String optometrist;    // Name of the optometrist (8-25 characters)
    private String[] remarkTypes = {"Client", "Optometrist"};  // Predefined remark types
    private ArrayList<String> postRemarks = new ArrayList<>();  // List to store remarks

    // Method to add a prescription and save to a file
    public boolean addPrescription() {
        // Condition 1: Validate First Name and Last Name length (must be between 4 and 15 characters)
        if (firstName.length() < 4 || firstName.length() > 15 || lastName.length() < 4 || lastName.length() > 15) {
            return false;  // Return false if validation fails
        }

        // Condition 2: Validate Address length (must be at least 20 characters)
        if (address.length() < 20) {
            return false;  // Return false if validation fails
        }

        // Condition 3: Validate sphere, cylinder, and axis values (all must be within their defined ranges)
        if (sphere < -20.00 || sphere > 20.00 || cylinder < -4.00 || cylinder > 4.00 || axis < 0 || axis > 180) {
            return false;  // Return false if validation fails
        }

        // Condition 4: Validate the date format for the eye examination date (DD/MM/YY)
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yy");
        String formattedDate = dateFormat.format(examinationDate);  // Convert date to string

        // Condition 5: Validate optometrist name length (must be between 8 and 25 characters)
        if (optometrist.length() < 8 || optometrist.length() > 25) {
            return false;  // Return false if validation fails
        }

        // If all conditions are met, write the prescription details to a file
        try (FileWriter writer = new FileWriter("C:\\Users\\sai.nalgonda\\eclipse-workspace\\Capstone Project\\Output_files\\presc.txt", true)) {
            writer.write("Prescription ID: " + prescID + "\n");
            writer.write("First Name: " + firstName + "\n");
            writer.write("Last Name: " + lastName + "\n");
            writer.write("Address: " + address + "\n");
            writer.write("Sphere: " + sphere + "\n");
            writer.write("Cylinder: " + cylinder + "\n");
            writer.write("Axis: " + axis + "\n");
            writer.write("Examination Date: " + formattedDate + "\n");
            writer.write("Optometrist: " + optometrist + "\n");
            writer.write("=================================\n");
            return true;  // Return true if the prescription is successfully written to the file
        } catch (IOException e) {
            e.printStackTrace();  // Print the exception if file writing fails
            return false;  // Return false if an error occurs
        }
    }

    // Method to add a remark and save to a file
    public boolean addRemark(String remark, String remarkType) {
        // Condition 1: Validate the remark (must have between 6 and 20 words, and the first word should start with an uppercase letter)
        String[] words = remark.split(" ");
        if (words.length < 6 || words.length > 20 || !Character.isUpperCase(words[0].charAt(0))) {
            return false;  // Return false if validation fails
        }

        // Condition 2: Validate the remark type (it must be either "Client" or "Optometrist") and limit the number of remarks to 2
        if (!remarkType.equalsIgnoreCase("Client") && !remarkType.equalsIgnoreCase("Optometrist")) {
            return false;  // Return false if the remark type is invalid
        }
        if (postRemarks.size() >= 2) {
            return false;  // Return false if there are already 2 remarks
        }

        // If conditions are met, add the remark and save it to a file
        postRemarks.add(remarkType + ": " + remark);

        try (FileWriter writer = new FileWriter("C:\\Users\\sai.nalgonda\\eclipse-workspace\\Capstone Project\\Output_files\\remark.txt", true)) {
            writer.write("Remark Type: " + remarkType + "\n");
            writer.write("Remark: " + remark + "\n");
            writer.write("=================================\n");
            return true;  // Return true if the remark is successfully written to the file
        } catch (IOException e) {
            e.printStackTrace();  // Print the exception if file writing fails
            return false;  // Return false if an error occurs
        }
    }

    // Setters for all attributes (used to set values from the main method)
    public void setPrescID(int prescID) {
        this.prescID = prescID;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setSphere(float sphere) {
        this.sphere = sphere;
    }

    public void setAxis(float axis) {
        this.axis = axis;
    }

    public void setCylinder(float cylinder) {
        this.cylinder = cylinder;
    }

    public void setExaminationDate(Date examinationDate) {
        this.examinationDate = examinationDate;
    }

    public void setOptometrist(String optometrist) {
        this.optometrist = optometrist;
    }

    // Main method for user input and interaction
    @SuppressWarnings("resource")
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Prescription obj = new Prescription();  // Create a new Prescription object

        // Taking user inputs for prescription details
        System.out.print("Enter Prescription ID: ");
        obj.setPrescID(scanner.nextInt());
        scanner.nextLine();  // Consume leftover newline from the previous input

        System.out.print("Enter First Name (4-15 characters): ");
        obj.setFirstName(scanner.nextLine());

        System.out.print("Enter Last Name (4-15 characters): ");
        obj.setLastName(scanner.nextLine());

        System.out.print("Enter Address (minimum 20 characters): ");
        obj.setAddress(scanner.nextLine());

        System.out.print("Enter Sphere value (-20.00 to +20.00): ");
        obj.setSphere(scanner.nextFloat());

        System.out.print("Enter Cylinder value (-4.00 to +4.00): ");
        obj.setCylinder(scanner.nextFloat());

        System.out.print("Enter Axis value (0 to 180): ");
        obj.setAxis(scanner.nextFloat());
        scanner.nextLine();  // Consume leftover newline from the previous input

        // Handling the examination date input and parsing it to Date format
        System.out.print("Enter Examination Date (DD/MM/YY): ");
        String dateInput = scanner.nextLine();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yy");
        try {
            Date examinationDate = dateFormat.parse(dateInput);
            obj.setExaminationDate(examinationDate);  // Set the parsed date
        } catch (ParseException e) {
            System.out.println("Invalid date format. Please use DD/MM/YY.");  // Handle invalid date format
            return;
        }

        System.out.print("Enter Optometrist Name (8-25 characters): ");
        obj.setOptometrist(scanner.nextLine());

        // Test addPrescription method
        if (obj.addPrescription()) {
            System.out.println("Prescription added successfully.");  // Success message if prescription is valid
        } else {
            System.out.println("Failed to add prescription. Please check the input conditions.");  // Failure message
            return;  // Exit the program if the prescription fails
        }

        // Loop to allow adding up to 2 remarks
        for (int i = 0; i < 2; i++) {
            System.out.println("Add a Remark (" + (i + 1) + " of 2)");

            System.out.print("Enter Remark (" + (i + 1) + ") (6 to 20 words, starting with uppercase): ");
            String remark = scanner.nextLine();

            System.out.print("Enter Remark Type (Client/Optometrist): ");
            String remarkType = scanner.nextLine();

            // Test addRemark method
            if (obj.addRemark(remark, remarkType)) {
                System.out.println("Remark added successfully.");  // Success message if remark is valid
            } else {
                System.out.println("Failed to add remark. Please check the input conditions.");  // Failure message
            }
        }

        scanner.close();  // Close the scanner resource
    }
}
