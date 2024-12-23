package PractiseProgram;

public class ReverseInteger {
	public static int reverse(int x) {

		int reversed=0;
		
		while(x!=0)
		{	
			int temp=x%10;
			x=x/10;
			if(reversed>0 && reversed>(Integer.MAX_VALUE-temp)/10
					||reversed<0 && reversed<(Integer.MIN_VALUE-temp)/10)
			{
			return 0;
			}
			reversed=reversed*10+temp;
		}
		return reversed;
	}
    public static void main(String[] args) {
        int x = 123;
        int result = reverse(x);
        System.out.println("Reversed integer: " + result);
    }
}
