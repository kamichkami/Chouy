package adapter;

public class SocketAdapterImplementation implements SocketAdapter {

	private Socket socket = new Socket();

	@Override
	public Volt get240Volt() {
		// TODO Auto-generated method stub
		return socket.getvolts();
	}

	@Override
	public Volt get10Volt() {
		// TODO Auto-generated method stub
		return convertVolt(socket.getvolts() , 24);
	}

	@Override
	public Volt get3Volt() {
		// TODO Auto-generated method stub
		return convertVolt(socket.getvolts(),80);
	}

	private Volt convertVolt(Volt input , int factor){
		int result = input.getVolts()/factor;
		Volt v= new Volt(result);
		return v;
	}

}
