
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
        // Old logic
        if(upiId == null || !upiId.contains("@")) {
            return false;
        }
        return true; // Assume payment succeeds
    }
}


access token-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

new token -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