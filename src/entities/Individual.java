package entities;

public class Individual extends TaxPayers{
	
	private Double healthExpenditures;
	
	public Individual() {
		super();
	}	

	public Individual(String name, Double anualIncome, Double healthExpenditures) {
		super(name, anualIncome);
		this.healthExpenditures = healthExpenditures;
	}
	
	public Double getHealthExpenditures() {
		return healthExpenditures;
	}

	public void setHealthExpenditures(Double healthExpenditures) {
		this.healthExpenditures = healthExpenditures;
	}

	@Override
	public double tax() {
		//double total = 0;
		if (getAnualIncome() < 20000.00) {
			return (getAnualIncome() * 0.15) - (healthExpenditures * 0.5);
			
		}
		else {
			return (getAnualIncome() * 0.25) - (healthExpenditures * 0.5);
		}
			
		//return total;
	}
	
	@Override
	public String toString() {
		return getName() + ": & " + String.format("%.2f", tax()); 
	}

}
