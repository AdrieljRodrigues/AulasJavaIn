package entitites;

public class BusinessAccount extends Account {

	private Double loanLimit;

	public BusinessAccount() {
		super();
	}

	public BusinessAccount(Integer number, String holder, Double balance, Double loanLimit) {
		super(number, holder, balance);
		this.loanLimit = loanLimit;
	}

	public Double getLoanLimit() {
		return loanLimit;
	}

	public void setLoanLimit(Double loanLimit) {
		this.loanLimit = loanLimit;
	}
	
	public void loan(Double amount) {
		if (amount <= loanLimit) {
			deposit(amount);
		}
	}
	
	@Override   ///sobrepoe o metodo da classe Account
	public void withDraw(Double amount) {
		super.withDraw(amount);  //usando o metodo da classe Account e alterando-o
		balance -= 2;
	}
}
