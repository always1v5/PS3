package PS3;

import java.sql.Date;

import javax.naming.InsufficientResourcesException;

public class account {
	private int id;
	private double balance;
	private double annualInterestRate;
	private Date dateCreated;
	private double monthlyInterestRate;
	
	public void account (){
		
		id = 0;
		balance = 0;
		annualInterestRate = 0;
		Date date = new Date(id);
		dateCreated = date;
			
	}

	public account(int id, double balance){
		
		this.id = id;
		
		this.balance = balance;
		
	}
	
	public int getid(){
		return id;
		
	}
	
	public void setid(int id){
		this.id = id;
	}
	
	public double getbalance(){
		return balance;
	}
	
	public void setblance(double blance){
		
		this.balance = blance;
		
	}
	
	public double getannualInterestRate(){
		return annualInterestRate;
	}
	
	public void setannualInterestRate(double annualInterestRate){
		this.annualInterestRate = annualInterestRate;
	}
	 
	public Date getdateCreated(){
		
		return dateCreated;
		
	}
	public double getMonthlyInterestRate(){
		monthlyInterestRate = annualInterestRate/12;
		
		return monthlyInterestRate;
		
	}
	
	public void otherCase() throws InsufficientFundsException {
		
	}
	
	public void withdraw(double specifiedAmount) throws InsufficientFundsException {
		balance = balance - specifiedAmount;
		otherCase();
	}
	
	public void deposit(double money){
		
		balance = balance + money;
	}
}
