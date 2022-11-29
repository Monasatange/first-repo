package array;

public class Array2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  int[][]arr= new int[11][3] ;
		   int count=2;
			  
			  for (int i = 0; i < arr.length; i++) { for (int j = 0; j < arr[i].length;
			  j++) {
			  
			  arr[i][0]=count; System.out.print(arr[i][j] +(i*j)+ "      ");
			  
			  
			  
			  } System.out.println(); }
			  
			  
			  int[][]array=
			  {{3,0,0},{3,1,3},{3,2,6},{3,3,9},{3,4,12},{3,5,15},{3,6,18},{3,7,21},{3,8,24}
			  ,{3,9,27},{3,10,30}};
			  
			  int[][]ar= new int [11][3]; System.out.println(arr.length);
			  
			  for (int i = 0; i < array.length; i++) { for (int j = 0; j < array[i].length;
			  j++) {
			  
			  System.out.print(array[i][j] +"          "); }
			  
			  System.out.println(); }
			  
			  
			 
		}
		
	}