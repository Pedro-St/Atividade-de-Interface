package entities.services;

public class PaypalService implements OnlinePaymentService {

	
	private static final double FEE_Percentage = 0.02;
	private static final double MONTHLY_Interest = 0.01;
	
	
	
	@Override
	public double paymentFee(double amount){ 
	
		return amount * FEE_Percentage;
		
	}
	
	@Override
	public double interest(double amount, int months) { 
		return amount * MONTHLY_Interest * months;
	}
	
}
