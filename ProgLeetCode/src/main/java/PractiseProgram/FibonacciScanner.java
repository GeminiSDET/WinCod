package PractiseProgram;
import java.util.Scanner;

public class FibonacciScanner {
	public static void main(String[] args) {
		int term,a=0,b=1,c;
		
		System.out.println("Enter term ");
		Scanner r=new Scanner(System.in);
		
		term=r.nextInt();
		for(int i=1;i<term;i++)
		{
			System.out.println(a);
			c=a+b;
			a=b;
			b=c;
		}
	}
}
