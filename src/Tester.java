import java.util.*;
public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Store supermarket = new Store();
		String name = "";
		double sale;
		while (!name.equalsIgnoreCase("EXIT")){
			Scanner kb = new Scanner(System.in);
			System.out.print("Enter name of customer (\"Exit\" to abort): ");
			name = kb.nextLine();
			if(!name.equalsIgnoreCase("EXIT")){
				System.out.print("Enter price of sale: ");
				sale = kb.nextDouble();
				System.out.println();
				supermarket.addSale(name, sale);
			}
		}
		System.out.println("The best costumer is " + supermarket.nameOfBestCustomer());
	}

}
