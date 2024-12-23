package PractiseProgram;

public class ReverseString {

	public static void main(String[] args) {
		String Original = "Java";
		String Reverse ="";
		
		for(int i=Original.length()-1;i>=0;i--)
		{
			Reverse+=Original.charAt(i);
		}
		System.out.println("Reversed String is " + Reverse);
	}
}
