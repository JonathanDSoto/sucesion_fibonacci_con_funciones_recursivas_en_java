import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("0, 1, "); 
		fibonacci(0,1);  
		
	}  
	
	static void fibonacci(int a,int b) {
		int c = 0;
		c = a + b;
		System.out.print(c+", ");
		if(c<1597) {
			fibonacci(b,c);
		}
	}
	
	 
}