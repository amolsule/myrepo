package simple;

public class Simple1 {

	public static void main(String[] args) {
		// Traffic Light Program
		
		String signal="GREEN";
		String green="GREEN";
		
		String signal1="RED";
		String red="RED";
		
		if(signal==green)
			System.out.println("Signal is Green,Go ahead");
		else
			System.out.println("Wait for Green Signal");
		
		if(signal1==red)
			System.out.println("Signal is RED ,Wait for GREEN Signal");
		else
			System.out.println("Go Ahead");
		
		System.out.println("Main Methos Ends");
			
		

	}

}
