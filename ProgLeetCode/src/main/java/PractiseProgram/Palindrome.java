package PractiseProgram;

public class Palindrome {
	public static void main(String[] args) {
		
		String str="Madaam";
		str=str.toLowerCase();
		boolean isPlaindrome=true;
		
// Check for palindrome by comparing characters from both ends
		for(int i=0;i<str.length()/2;i++)
		{
			if(str.charAt(i) != str.charAt(str.length()-1-i))
			{
				isPlaindrome=false;
				break;
			}
		}
		if(isPlaindrome)
		{
			System.out.println("String is Palindrome");
		}
		else
		{
			System.out.println("String is not Plaindrome");
		}
	}
}
