import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
/** */
import java.util.List;

public class BusinessLayerTest {

    private BusinessLayer businessLayer;
    private DataLayer dataLayer;

    @BeforeEach
    public void setUp() {
        dataLayer = new DataLayer();  // Create an instance of DataLayer
        businessLayer = new BusinessLayer(dataLayer);  // Create an instance of BusinessLayer with DataLayer
    }

    @Test
    public void testProcessPayment() {
        Payment payment = new Payment("TXN001", "user001", 50.0, "Membership Fee");

        // Process the payment
        businessLayer.processPayment(payment);

        // Retrieve all payments from DataLayer and assert that the payment is saved
        List<Payment> allPayments = businessLayer.getAllPayments();
        assertEquals(1, allPayments.size(), "There should be 1 payment.");
        assertTrue(allPayments.contains(payment), "The payment should be in the list.");
    }

    @Test
    public void testProcessDuplicatePayment() {
        Payment payment1 = new Payment("TXN001", "user001", 50.0, "Membership Fee");
        Payment payment2 = new Payment("TXN001", "user002", 30.0, "Overdue Fine");

        // Process the first payment
        businessLayer.processPayment(payment1);
        
        // Process the second payment (with the same transaction ID)
        businessLayer.processPayment(payment2);

        // Verify only the first payment was saved (duplicate should not be added)
        List<Payment> allPayments = businessLayer.getAllPayments();
        assertEquals(1, allPayments.size(), "There should be 1 payment.");
        assertTrue(allPayments.contains(payment1), "Payment1 should be in the list.");
        assertFalse(allPayments.contains(payment2), "Payment2 should NOT be in the list.");
    }

    @Test
    public void testGetPaymentDetails() {
        Payment payment = new Payment("TXN002", "user003", 20.0, "E-Book Purchase");

        // Process the payment
        businessLayer.processPayment(payment);

        // Retrieve payment details by transaction ID
        Payment retrievedPayment = businessLayer.getPaymentDetails("TXN002");

        // Assert the retrieved payment has the correct transaction ID
        assertNotNull(retrievedPayment, "Payment should be retrieved successfully.");
        assertEquals("TXN002", retrievedPayment.getTransactionId(), "Transaction ID should match.");
    }

    @Test
    public void testGetAllPayments() {
        Payment payment1 = new Payment("TXN003", "user004", 10.0, "Library Fee");
        Payment payment2 = new Payment("TXN004", "user005", 15.0, "Book Rental");

        // Process the payments
        businessLayer.processPayment(payment1);
        businessLayer.processPayment(payment2);

        // Retrieve all payments
        List<Payment> allPayments = businessLayer.getAllPayments();

        // Assert that both payments are in the list
        assertEquals(2, allPayments.size(), "There should be 2 payments.");
        assertTrue(allPayments.contains(payment1), "Payment1 should be in the list.");
        assertTrue(allPayments.contains(payment2), "Payment2 should be in the list.");
    }
}
