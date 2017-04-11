import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.NotSerializableException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {

	public static void main(String[] args) {

		Account acc1 = new Account(123456789, "LON", "ACT");
		Account acc2 = new Account(987654321, "LON", "CLO");
		Account acc3 = new Account(654321789, "CCR", "ACT");

		Customer cus1 = new Customer();
		cus1.addAccount(acc3);
		cus1.addAccount(acc2);
		cus1.setFirstName("Ivan");
		cus1.setLastName("Ivanov");

		Customer cus2 = new Customer();
		cus2.addAccount(acc1);
		cus2.setFirstName("Petr");
		cus2.setLastName("Petrov");

		try {
			System.out.println("Starting serialization...");
			FileOutputStream outFile = new FileOutputStream("customer.txt");
			ObjectOutputStream out = new ObjectOutputStream(outFile);
			out.writeObject(cus1);
			out.writeObject(cus2);
			out.close();
			outFile.close();
			System.out.println("Serialize date saved in customer.txt file!");

		} catch (NotSerializableException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		try {
			System.out.println("Read objects from file...");
			FileInputStream inFile = new FileInputStream("customer.txt");
			ObjectInputStream in = new ObjectInputStream(inFile);

			while (inFile.available() > 0) {
				Customer cus = (Customer) in.readObject();
				System.out.println(cus);
			}
			System.out.print("Finish!");

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
