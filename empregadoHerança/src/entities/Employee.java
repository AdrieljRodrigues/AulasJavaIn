package entities;

public class Employee {

	private String name;
	protected Double valuePerHours;
	protected Integer hours;
	
	
	public Employee() {
	}


	public Employee(String name, Double valuePerHours, Integer hours) {
		this.name = name;
		this.valuePerHours = valuePerHours;
		this.hours = hours;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Double getValuePerHours() {
		return valuePerHours;
	}


	public void setValuePerHours(Double valuePerHours) {
		this.valuePerHours = valuePerHours;
	}


	public Integer getHours() {
		return hours;
	}


	public void setHours(Integer hours) {
		this.hours = hours;
	}
	
	public Double payment() {
		return hours * valuePerHours;
	}	
}
