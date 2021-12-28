package week1.day1;

public class FactorialNo {
	
	private void Theno() {

System.out.println("The factorial of 5");
System.out.println("Answer = ");

	}

	public static void main(String[] args) {
		FactorialNo f = new FactorialNo();
		f.Theno();
		
		int factorial = 1;
		for(int i = 1; i <= 5 ; i++)
		{
			factorial =factorial * i;
			
		}
		System.out.println( factorial);
	}

}
