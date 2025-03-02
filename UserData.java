/*
 * UserData.java
 * This class represents the data layer for user registration in an Online Library System.
 * It stores user details and provides methods for retrieving them.
 */

import java.util.HashMap;
import java.util.Map;
 
public class UserData {
    // Simulated database using a HashMap (userId -> User Object)
    private Map<String, String> registeredUsers = new HashMap<>();

    /*
     * Saves user registration details.
     *
     * @param userId   Unique identifier for the user.
     * @param userInfo User details (e.g., name, email).
     */
    public void saveUser(String userId, String userInfo) {
        registeredUsers.put(userId, userInfo);
        System.out.println("User registered successfully: " + userId);
    }

    /*
     * Retrieves user details by ID.
     *
     * @param userId Unique identifier for the user.
     * @return User information or null if not found.
     */
    public String getUser(String userId) {
        return registeredUsers.get(userId);
    }
}
