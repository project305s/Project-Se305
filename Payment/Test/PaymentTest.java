import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PaymentTest {

    @Test
    public void testPaymentConstructor() {
        // Create a Payment object
        Payment payment = new Payment("TXN001", "user001", 50.0, "Membership Fee");

        // Assert that the constructor correctly initializes the fields
        assertEquals("TXN001", payment.getTransactionId(), "Transaction ID should match.");
        assertEquals("user001", payment.getUserId(), "User ID should match.");
        assertEquals(50.0, payment.getAmount(), "Amount should match.");
        assertEquals("Membership Fee", payment.getDescription(), "Description should match.");
    }

    @Test
    public void testPaymentGetters() {
        Payment payment = new Payment("TXN002", "user002", 30.0, "Overdue Fine");

        // Test the getters
        assertEquals("TXN002", payment.getTransactionId(), "Transaction ID should match.");
        assertEquals("user002", payment.getUserId(), "User ID should match.");
        assertEquals(30.0, payment.getAmount(), "Amount should match.");
        assertEquals("Overdue Fine", payment.getDescription(), "Description should match.");
    }

    @Test
    public void testToString() {
        Payment payment = new Payment("TXN003", "user003", 20.0, "E-Book Purchase");

        // Test the toString method for proper formatting
        String expectedToString = "Payment{transactionId='TXN003', userId='user003', amount=20.0, description='E-Book Purchase'}";
        assertEquals(expectedToString, payment.toString(), "toString should return the correct string representation.");
    }
}
/* */