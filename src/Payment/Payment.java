 // Payment.java

/**
 * Model class representing a payment in the Online Library System.
 */ 
public class Payment {
    public final String transactionId;
    public final String userId;
    public final double amount;
    public final String description;
 
    public Payment(String transactionId, String userId, double amount, String description) {
        this.transactionId = transactionId;
        this.userId = userId;
        this.amount = amount;
        this.description = description;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public String getUserId() {
        return userId;
    }

    public double getAmount() {
        return amount;
    }

    public String getDescription() {
        return description;
    }

    
public String toString() {
    return String.format("Payment{transactionId='%s', userId='%s', amount=%.2f, description='%s'}",
            transactionId, userId, amount, description);
}

}
