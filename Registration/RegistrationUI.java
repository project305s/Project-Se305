/*
 * RegistrationUI.java
 * This class represents the presentation layer for user registration in an Online Library System.
 * It allows users to register and view their details.
 */

import java.util.Scanner;

public class RegistrationUI {
    private RegistrationService registrationService;

    // Constructor
    public RegistrationUI() {
        this.registrationService = new RegistrationService();
    }

    /*
     * Starts the registration system.
     */
    public void start() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n=== Online Library Registration System ===");
            System.out.println("1. Register a New User");
            System.out.println("2. View Registered User Details");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter User ID: ");
                    String userId = scanner.nextLine();

                    System.out.print("Enter Name: ");
                    String userName = scanner.nextLine();

                    System.out.print("Enter Email: ");
                    String email = scanner.nextLine();

                    boolean success = registrationService.registerUser(userId, userName, email);
                    if (success) {
                        System.out.println("Registration successful!");
                    } else {
                        System.out.println("Registration failed.");
                    }
                    break;

                case 2:
                    System.out.print("Enter User ID to view details: ");
                    String viewUserId = scanner.nextLine();

                    String userDetails = registrationService.getUserDetails(viewUserId);
                    if (userDetails != null) {
                        System.out.println("User ID: " + viewUserId + ", " + userDetails);
                    } else {
                        System.out.println("No user found with ID: " + viewUserId);
                    }
                    break;

                case 3:
                    System.out.println("Exiting Registration System. Goodbye!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}
