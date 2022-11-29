package array;

public class ArrayTask2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		System.out.println("Original Array Number" );
		
		int []arr= {10,5,6};
		for (int i = 0; i < arr.length; i++) {
			
		System.out.println(arr[i]);
		
		}
		
		
		System.out.println("===============================================================");
		
		
		int temp;
		for (int i = 0; i < arr.length; i++) {
			
			for (int j = i+1; j < arr.length; j++) {
				if(arr [i]> arr[j]) {
					temp = arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
	}
		System.out.println("Ascending Array Number ");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(+arr[i]);
			
			
			
	}
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if(arr [i]< arr[j]) {
					temp = arr[i];
					arr[i]=arr[j];
					arr[j]=temp;

				}}}
		System.out.println("===============================================================");
		
		System.out.println("Descending Array Number");
		for (int i = 0; i < arr.length; i++) {
			
			
			System.out.println(+arr[i]);
		
	
}}}
