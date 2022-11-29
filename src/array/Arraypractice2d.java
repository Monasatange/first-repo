package array;

public class Arraypractice2d {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int [][] arr= new int [10][2];
		int row=1,column=1;
		
	
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				
				
				  arr[i][j]=row*column;
				 
				  column=column+2;
				 
				
			}
			 row=row+1;
			
			 column=1; 
			
	}
		for (int i2 = 0; i2 < arr.length; i2++) {
			for (int j = 0; j < arr[i2].length; j++) {
				
				System.out.print(arr[i2][j]+"       ");
			}
			System.out.println();
		
		
		
		
		}}}
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*
		 * int [][] num=new int [11][4] ;
		 * 
		 * 
		 * for (int i = 1; i <num.length; i++) { for (int j = 1; j <num[i].length; j++)
		 * {
		 * 
		 * 
		 * 
		 * System.out.print(num[i][j] + i*j+ "     ");
		 * 
		 * }
		 * 
		 * System.out.println();
		 * 
		 * 
		 * }
		 * 
		 */
				
				
			
			
			
		
			
		
		
			
		
				
		
		
		
		
		
		
		
		
		
		
		
		
		
		

		


