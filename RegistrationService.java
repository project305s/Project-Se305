/**
 * RegistrationService.java
 * This class represents the business logic for user registration in an Online Library System.
 * It ensures proper validation and saves user data.
 */

public class RegistrationService {
    private UserData userData;

    // Constructor
    public RegistrationService() {
        this.userData = new UserData();
    }

    /**
     * Registers a new user by validating and storing their details.
     *
     * @param userId   Unique identifier for the user.
     * @param userName Name of the user.
     * @param email    Email address of the user.
     * @return True if registration is successful, false otherwise.
     */
    public boolean registerUser(String userId, String userName, String email) {
        if (userId == null || userId.isEmpty() || userName == null || userName.isEmpty() || email == null || email.isEmpty()) {
            System.out.println("Invalid user details. Registration failed.");
            return false;
        }

        String userInfo = "Name: " + userName + ", Email: " + email;
        userData.saveUser(userId, userInfo);
        System.out.println("User registration completed: " + userId);
        return true;
    }

    /**
     * Retrieves registered user details.
     *
     * @param userId Unique identifier for the user.
     * @return User details or null if not found.
     */
    public String getUserDetails(String userId) {
        return userData.getUser(userId);
    }
}
