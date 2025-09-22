
// File: PaymentService.java
public class PaymentService {

    public boolean processCreditCard(String cardNumber, double amount) {
        // Old logic
        if(cardNumber == null || cardNumber.length() != 16) {
            return false;
        }
        return true; // Assume payment succeeds
    }

    public boolean processUPI(String upiId, double amount) {
        // Updated logic
        if(upiId == null || !upiId.endsWith("@upi")) {  // <-- Changed condition
            return false;
        }
        return true;
    }
}
