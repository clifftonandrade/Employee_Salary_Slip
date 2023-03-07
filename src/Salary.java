/**
 * @author cliffton andrade
 * @version 1.0
 * 
 * <b>Creating class Salary</b>
 */
public class Salary {
	private double basicSalary;
	private double hra;
	private double da;
	private double grossSalary;
	private double incomeTax;
	
	/***
	 * 
	 * @param basicSalary Takes input of the Employee Salary.
	 */
	//Parametrized contructor
	public Salary(double basicSalary) {
		this.basicSalary = basicSalary;
		this.hra = 0.1 * basicSalary;
		this.da = 0.73 *  basicSalary;
		this.grossSalary = basicSalary + da + hra;
		this.incomeTax = 0.3 * grossSalary;	
	}
	/**
	 * 
	 * @param basicSalary Takes input of the Employee Salary.
	 */
	//Setting basic Salary
	public void setBasicSalary(double basicSalary) {
		this.basicSalary = basicSalary;
		this.hra = 0.1 * basicSalary;
		this.da = 0.73 *  basicSalary;
		this.grossSalary = basicSalary + da + hra;
		this.incomeTax = 0.3 * grossSalary;
		
	}
	/**
	 * 
	 * @return the salary of the Employee.
	 */
	//Getting Basic salary
	public double getBasicSalary() {
		return basicSalary;
	}
	/**
	 * 
	 * @return House rent allowance calculated 10% on basicSalary
	 */
	//getting HRA
	public double getHra() {
		return hra;
	}
	/**
	 * 
	 * @return Dearness Allowance calculated 73% on basicSalary
	 */
	//getting DA
	public double getDa() {
		return da;
	}
	/**
	 * 
	 * @return Gross Salary calculated by adding basic salary, Dearness allowance and house rent allowance.
	 */
	//getting Gross Salary
	public double getGrossSalary() {
		return grossSalary;
	}
	/**
	 * 
	 * @return Income Tax calculated 30% on Gross Salary.s
	 */
	//getting IncomeTax
	public double getIncomeTax() {
		return incomeTax;
	}
	/**
	 * 
	 * @return NetSalary calculated by subtracting Gross Salary with income tax.
	 */
	//Getting Net Salary
	public double getNetSalary() {
		return grossSalary - incomeTax;
	}
	/**
	 *To Display Employee Salary Information.
	 */
	//Printing Information
	public void displayInfo() {
		System.out.println("-----------------------------------");
		setBasicSalary(12000);
		System.out.println("Basic Salary:"+getBasicSalary());
		System.out.println("Dearness Allowance:"+getDa());
		System.out.println("Gross Salary:"+getGrossSalary());
		System.out.println("Income Tax:"+getIncomeTax());
		System.out.println("....................................");
		System.out.println("Net Salary:"+getNetSalary());
		System.out.println("....................................");
	}
}
