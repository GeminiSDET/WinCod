package PractiseProgram;

public class LargestElementArray {

	public static void main(String[] args) {
		
		int[] num= {45,23,78,12,9};
		int largest=num[0];
		
		for(int i=1;i<num.length;i++)
		{
			if(num[i]>largest)
			{
				largest=num[i];
			}
		}
		System.out.println(largest);
	}
}
