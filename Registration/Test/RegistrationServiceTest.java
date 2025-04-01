import org.junit.Test;
import static org.junit.Assert.*;

public class RegistrationServiceTest {

    @Test
    public void testRegisterUserSuccess() {
        // Arrange
        RegistrationService registrationService = new RegistrationService();
        
        // Act
        boolean result = registrationService.registerUser("U001", "John Doe", "john@example.com");

        // Assert
        assertTrue(result);
        assertNotNull(registrationService.getUserDetails("U001"));
    }

    @Test
    public void testRegisterUserFailure() {
        // Arrange
        RegistrationService registrationService = new RegistrationService();

        // Act & Assert
        assertFalse(registrationService.registerUser("", "John Doe", "john@example.com"));
        assertFalse(registrationService.registerUser("U002", "", "john@example.com"));
        assertFalse(registrationService.registerUser("U003", "John Doe", ""));
    }

    @Test
    public void testGetUserDetails() {
        // Arrange
        RegistrationService registrationService = new RegistrationService();
        registrationService.registerUser("U004", "Alice", "alice@example.com");

        // Act
        String userDetails = registrationService.getUserDetails("U004");

        // Assert
        assertNotNull(userDetails);
        assertTrue(userDetails.contains("Alice"));
        assertTrue(userDetails.contains("alice@example.com"));
    }

    @Test
    public void testGetUserDetailsForNonExistingUser() {
        // Arrange
        RegistrationService registrationService = new RegistrationService();

        // Act
        String userDetails = registrationService.getUserDetails("U999");

        // Assert
        assertNull(userDetails);
    }
}