package entities;

public class Company extends TaxPayers{
	
	private Integer numberEmployees;
	
	public Company() {
		super();
	}

	public Company(String name, Double anualIncome, Integer numberEmployees) {
		super(name, anualIncome);
		this.numberEmployees = numberEmployees;
	}
	
	public Integer getNumberEmployees() {
		return numberEmployees;
	}

	public void setNumberEmployees(Integer numberEmployees) {
		this.numberEmployees = numberEmployees;
	}

	@Override
	public double tax() {		
		if(numberEmployees > 10){
			return getAnualIncome() * 0.14;
		}
		else {
			return getAnualIncome() * 0.16;
		}	
	}	
	
	public String toString() {
		return getName() + ": & " + String.format("%.2f", tax()); 
	}

}