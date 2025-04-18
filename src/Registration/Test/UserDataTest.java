import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class UserDataTest {
    private UserData userData;

    @Before
    public void setUp() {
        userData = new UserData();
    }

    @Test
    public void testSaveUser() {
        userData.saveUser("U001", "Name: John Doe, Email: john@example.com");
        assertEquals("Name: John Doe, Email: john@example.com", userData.getUser("U001"));
    }

    @Test
    public void testGetUser() {
        userData.saveUser("U002", "Name: Alice, Email: alice@example.com");
        String userDetails = userData.getUser("U002");
        assertNotNull(userDetails);
        assertEquals("Name: Alice, Email: alice@example.com", userDetails);
    }

    @Test
    public void testGetNonExistingUser() {
        assertNull(userData.getUser("U999")); // User ID not registered
    }
}