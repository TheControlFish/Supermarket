import java.util.*;
public class Store {
	ArrayList<Customer> list = new ArrayList<Customer>(); 
	public Store(){
		
	}
	public void addSale(String customerName, double amount){
		list.add(new Customer(customerName, amount));
	}
	public String nameOfBestCustomer(){
		double maxSale = 0;
		String name = "";
		for (int n = 0; n < list.size(); n++){
			if(list.get(n).sale() > maxSale){
				maxSale = list.get(n).sale();
				name = list.get(n).name();
			}
		}
		return name;
	}
}
