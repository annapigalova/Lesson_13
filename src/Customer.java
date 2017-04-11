import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Customer implements Serializable {

	private String firstName;
	private String lastName;
	private List<Account> accountList = new ArrayList<Account>();

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public List<Account> getAccountList() {
		return accountList;
	}

	public void addAccount(Account card) {
		accountList.add(card);
	}

	@Override
	public String toString() {
		return "First Name: " + getFirstName() + System.lineSeparator() + "Last Name: " + getLastName();
	}

}
