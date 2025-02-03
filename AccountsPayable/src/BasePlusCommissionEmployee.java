
public class BasePlusCommissionEmployee extends CommissionEmployee {
	private double basePay;

	public BasePlusCommissionEmployee(String firstName, String lastName, int ssn, double grossSales,
			double commissionRate, double basePay) {
		super(firstName, lastName, ssn, grossSales, commissionRate);
		this.basePay = basePay;
	}

	public double getBasePay() {
		return basePay;
	}

	public void setBasePay(double basePay) {
		this.basePay = basePay;
	}

	@Override
	public double getPaymentAmount() {
		
		return getBasePay()+(super.getCommissionRate()*super.getGrossSales());
		
	}

	@Override
	public String toString() {
		return "BasePlusCommissionEmployee [getFirstName()=" + getFirstName() + ", getLastName()=" + getLastName()
				+ ", getSsn()=" + getSsn() + ", getGrossSales()=" + getGrossSales() + ", getCommissionRate()="
				+ getCommissionRate() + ", basePay=" + basePay + ", getBasePay()=" + getBasePay() + "]";
	}
	
	
	
}
