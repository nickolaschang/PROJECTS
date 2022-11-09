package services;

public class PayPalService implements OnlinePaymentService {
	
	
	@Override
	public double paymentFee(double amount) {
		return amount * 0.02;
	}
	
	@Override
	public double interest(double quantity, int months) {
		return quantity * 0.01 * months;
	}
}
