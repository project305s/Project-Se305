import java.util.HashMap;
import java.util.Map;

public class UserData {
    // Simulated database using a HashMap (userId -> User Info)
    private Map<String, String> registeredUsers = new HashMap<>();

    /**
     * Saves user registration details.
     * Prevents overwriting an existing user and validates input data.
     * @return True if registration is successful, false otherwise.
     */
    public boolean saveUser(String userId, String userInfo) {
        if (userId == null || userId.isEmpty() || userInfo == null || userInfo.isEmpty()) {
            System.out.println("Invalid user details. Registration failed.");
            return false;
        }

        if (registeredUsers.containsKey(userId)) {
            System.out.println("User already exists. Registration failed.");
            return false;
        }

        registeredUsers.put(userId, userInfo);
        System.out.println("User registered successfully: " + userId);
        return true;
    }

    /**
     * Retrieves user details by ID.
     * Returns a message if user is not found.
     * 
     * @param userId Unique identifier for the user.
     * @return User information or a message if not found.
     */
    public String getUser(String userId) {
        if (userId == null || userId.isEmpty()) {
            return "Invalid user ID.";
        }
else
       return registeredUsers.getOrDefault(userId, "User not found.");

    }
}
