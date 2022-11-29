package array;

public class Palindronnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] num = new int[200];
		int count = 55;
		
	for (int i = 0; i < num.length; i++) {
		num[i]= count;
		count++;
	}
	
	
	for (int i = 0; i < num.length; i++) {
		
		int org = num[i];
		 int temp = org;
		 
		 int rev = 0;

		 
		 while (temp != 0) {
			int rem = temp%10;
			 rev = (rev *10)+rem;
			 temp = temp /10;
		 } 
		if (org == rev) {
			System.out.print(num[i]+" ");
		}
		
	}
	}

}
