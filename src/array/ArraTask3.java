package array;

public class ArraTask3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][]arr=new int[11][3];
		int count=5;
		int add =0;
		System.out.println("Table Of" +count);
		for (int i = 0; i < arr.length; i++) {
			

				arr[i][0]=count;

				arr[i][1]=add;
				arr[i][2]=arr[i][0]* arr[i][1];;
				
				add++;
				
			}
		  for (int i = 0; i < arr.length; i++){ 
			  for (int j = 0; j < arr[i].length;j++) {
				
				  System.out.print(arr[i][j] +"     ");
			  }
		  System.out.println();
		  
		  
		  }
		 
		 System.out.println("=============================================================================================="); 
		  
		 int[] num = new int[200];
			int a = 55;
			
		for (int i = 0; i < num.length; i++) {
			num[i]= a;
			a++;
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