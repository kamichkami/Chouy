package adapter;

public class AdapterDemo {

	public static void main(String[] args) {
		SocketAdapter adaptr = new SocketAdapterImplementation();
		Volt output = adaptr.get240Volt();
		System.out.println("output is "+output.getVolts());

		output = adaptr.get10Volt();
		System.out.println("output is "+output.getVolts());

		output = adaptr.get3Volt();
		System.out.println("output is "+output.getVolts());

	}

}
