package entities;

public class ImportedProduct extends Product {
	
	private double customsFee;
	
	public ImportedProduct(String name, Double price) {
		super(name, price);
	}

	public ImportedProduct(String name, Double price, double customsFee) {
		super(name, price);
		this.customsFee = customsFee;
	}

	public double getCustomsFee() {
		return customsFee;
	}

	public void setCustomsFee(double customsFee) {
		this.customsFee = customsFee;
	}
	
	public Double totalprice() {
		return this.getPrice() + customsFee;
	}
	
	@Override
	public String priceTag() {
		return name + " $ " 
					+ String.format("%.2f", price) 
					+ "(Customs Fee: $%.2f" 
					+ customsFee
					+ ")";
}

}
	