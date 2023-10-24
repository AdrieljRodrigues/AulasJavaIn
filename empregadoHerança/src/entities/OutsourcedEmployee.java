package entities;

public class OutsourcedEmployee extends Employee{

	private Double additionalCharge;

		
	public OutsourcedEmployee(String name, Double valuePerHours, Integer hours) {
		super(name, valuePerHours, hours);
	}

	public OutsourcedEmployee(String name, Double valuePerHours, Integer hours, Double additionalCharge) {
		super(name, valuePerHours, hours);
		this.additionalCharge = additionalCharge;
	}

	public Double getAdditionalCharge() {
		return additionalCharge;
	}

	public void setAdditionalCharge(Double additionalCharge) {
		this.additionalCharge = additionalCharge;
	}
	
	@Override
	public Double payment() {
		return hours * valuePerHours * 1.1;
	}
	
	
}
