package assignment3command;

public class DemoCommand {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		Stock stock = new Stock();
		
		BuyStock buystockOrder = new BuyStock(stock);
		SellStock sellstockOrder = new SellStock(stock);
		
		Broker broker =new Broker();
		broker.takeOrder(buystockOrder);
		broker.takeOrder(sellstockOrder);
		
		broker.placeOrder();
	}

}
