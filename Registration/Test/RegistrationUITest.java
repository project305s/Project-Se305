import org.junit.Test;
import java.io.ByteArrayInputStream;
import java.io.InputStream;

public class RegistrationUITest {
    @Test
    public void testStart() {
        // Simulate user input: Register User (1), User ID (U001), Name (John), Email (john@example.com), Exit (3)
        String input = "1\nU001\nJohn\njohn@example.com\n3\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        // Run the UI (it should process input and exit cleanly)
        RegistrationUI ui = new RegistrationUI();
        ui.start();

        // Reset System.in after test
        System.setIn(System.in);
    }
}