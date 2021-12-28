package week1.day1;
// 0 1 1 2 3 5.....
public class fibonacci {
	public void fibo() {
		System.out.println("The fibonacci series of 10 nos:");
	}

	public static void main(String[] args) {
		fibonacci f = new fibonacci();
		f.fibo();
	
	int a=0,b=1,c,i ;
	System.out.println(a);
	System.out.println(b);
		for( i = 2 ; i <= 10 ; ++i) {
		c = a + b;
		a = b;
		b = c;
			
			
			
		
		System.out.println(c);

	}

	}
}
