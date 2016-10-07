package PS3;

import static org.junit.Assert.*;

import javax.naming.InsufficientResourcesException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class AccountTest{
	

	account c;
	
	@Before
	public void setUp() throws Exception {
		c = new account(1122 , 20000);
		c.setannualInterestRate(0.045);
	}

	@After
	public void tearDown() throws Exception {
		c = null;
	}

	@Test
	public void testWithdraw() throws InsufficientFundsException {
		c.withdraw(2500);
		assertEquals("actual is $17500", (long) c.getbalance(),(long)17500);
        c.withdraw(900);
        assertFalse("actual is $19100", c.getbalance()==19000);
	}

	@Test
	public void testDeposit() {
		c.deposit(3000);
		assertEquals("actual is $23000", (long) c.getbalance(),(long)23000);
		c.deposit(3000);
		assertFalse("actual is not equal 23000", c.getbalance()==22002);
		
		}

	@Test
	public void testprint(){
		c = new account(111,2222);
		System.out.printf("monthly interest rate is",c.getMonthlyInterestRate());
		System.out.printf("balance is",c.getbalance());
		
	}
}
