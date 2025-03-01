package com.library.presentation;

import com.library.business.RegistrationService;
import java.util.Scanner;

/**
 * This class provides a simple user interface for registration.
 */
public class RegistrationUI {
    private RegistrationService service = new RegistrationService();
    private Scanner scanner = new Scanner(System.in);

    public void start() {
        while (true) {
            System.out.println("\n1. Register User\n2. View User\n3. Exit");
            System.out.print("Choose: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            if (choice == 1) {
                System.out.print("Enter User ID: ");
                String userId = scanner.nextLine();
                System.out.print("Enter Name: ");
                String name = scanner.nextLine();
                System.out.print("Enter Email: ");
                String email = scanner.nextLine();

                if (service.registerUser(userId, name, email)) {
                    System.out.println("Registration successful!");
                } else {
                    System.out.println("Registration failed. Please enter valid details.");
                }
            } 
            else if (choice == 2) {
                System.out.print("Enter User ID: ");
                String userId = scanner.nextLine();
                String user = service.getUserDetails(userId);
                System.out.println(user != null ? user : "User not found.");
            } 
            else {
                System.out.println("Exiting...");
                break;
            }
        }
        scanner.close();
    }

    public static void main(String[] args) {
        new RegistrationUI().start();
    }
}
