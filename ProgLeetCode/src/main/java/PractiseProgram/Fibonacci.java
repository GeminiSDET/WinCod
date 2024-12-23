package PractiseProgram;

public class Fibonacci {

	public static void main(String[] args) {
		int n=10;
		int first=0;
		int second=1;
		
		System.out.println("First " + n + " Fibonacci numbers: " + first + ", " +second);
		
		for(int i=1;i<-n;i++)
		{
			int next =first+second;
			System.out.println(", " +next);
			
			first =second;
			second=next;
		}
	}

}
