package day10_loops;

public class Task1SalaryCalculator {

	public static void main(String[] args) {
		
		
		int hourlyRate = 50;
		int weeklyHours = 40;
		float stateTaxRate = 0.10f;
		float federalTaxRate = 0.15f;
		
		int salaryBeforeTax = hourlyRate * weeklyHours * 52;
		float fedTax = salaryBeforeTax * federalTaxRate;
		float stateTax = salaryBeforeTax * stateTaxRate;
		float totalTax = fedTax + stateTax;
		float net = salaryBeforeTax - totalTax;
		
		System.out.println("Gross pay is: $"+salaryBeforeTax);
		System.out.println("Federal tax is: $"+fedTax);
		System.out.println("State tax is: $"+stateTax);
		System.out.println("Total tax is $"+totalTax);
		System.out.println("Net Income is: $"+net);
		
		
		
		

	}

}
