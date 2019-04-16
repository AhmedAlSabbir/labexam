
import java.io.Serializable;

public class Bankinformation implements Serializable
{
	private Personal person;
	private String accNum; 
	private double balance;
	
	public Bankinformation ( String accNum, Personal person,double balance) {

		this.accNum = accNum;
		this.person=person;
		this.balance = balance;
	}

    Bankinformation(String accNum, Personal persona, double balance) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

	public String getAccNum() {
		return accNum;
	}

	public void setAccNum(String accNum) {
		this.accNum = accNum;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
}
