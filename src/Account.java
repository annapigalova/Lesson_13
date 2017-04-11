import java.io.Serializable;

public class Account implements Serializable {

	transient private int accountNumber;
	private String type;
	private String status;

	public Account(int accountNumber, String type, String status) {
		this.accountNumber = accountNumber;
		this.type = type;
		this.status = status;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int cardNumber) {
		this.accountNumber = cardNumber;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {

		return "Card Number: " + getAccountNumber() + " " + "Card Type:  " + getType() + " " + "Card Status: "
				+ getStatus();
	}

}
