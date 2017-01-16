package assignment3command;

public class Stock {
	
	private String name ="perfume";
	private int quantity=2;

	
	public void buy(){
		System.out.println("Stock[name : " +name+ " Quantity " +quantity+ "]bought");
	}
	public void sell(){
		System.out.println("Stock[ name : " +name+ " Quantity " +quantity+ " ] Sold");
	}
}
