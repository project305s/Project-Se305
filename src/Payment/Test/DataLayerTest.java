import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

public class DataLayerTest {

    private DataLayer dataLayer

    @BeforeEach
    public void setUp() {
        dataLayer = new DataLayer(); // Create a fresh instance before each test
    }

    @Test
    public void testSavePayment() {
        Payment payment = new Payment("TXN001", "user001", 50.0, "Membership Fee");

        assertTrue(dataLayer.savePayment(payment), "Payment should be saved successfully.");
    }
/* */
    @Test
    public void testSaveDuplicatePayment() {
        Payment payment1 = new Payment("TXN001", "user001", 50.0, "Membership Fee");
        dataLayer.savePayment(payment1); // Save the first payment

        Payment payment2 = new Payment("TXN001", "user002", 30.0, "Overdue Fine");

        // Should return false as the transaction ID already exists
        assertFalse(dataLayer.savePayment(payment2), "Duplicate transaction should not be saved.");
    }

    @Test
    public void testGetPaymentById() {
        Payment payment = new Payment("TXN002", "user003", 20.0, "E-Book Purchase");
        dataLayer.savePayment(payment);

        Payment retrievedPayment = dataLayer.getPaymentById("TXN002");

        assertNotNull(retrievedPayment, "Payment should be found by transaction ID.");
        assertEquals("TXN002", retrievedPayment.getTransactionId(), "Transaction ID should match.");
    }

    @Test
    public void testGetAllPayments() {
        Payment payment1 = new Payment("TXN003", "user004", 10.0, "Library Fee");
        Payment payment2 = new Payment("TXN004", "user005", 15.0, "Book Rental");

        dataLayer.savePayment(payment1);
        dataLayer.savePayment(payment2);

        List<Payment> payments = dataLayer.getAllPayments();
        
        assertEquals(2, payments.size(), "There should be 2 payments stored.");
        assertTrue(payments.contains(payment1), "Stored payments should include payment1.");
        assertTrue(payments.contains(payment2), "Stored payments should include payment2.");
    }
}
