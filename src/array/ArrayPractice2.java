package array;

public class ArrayPractice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char []arr= {65,70,66,90,85,74};
		System.out.println(arr.length);
		
		
		for (char i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
			
			
		}
		char temp;
		
		for (char i = 0; i < arr.length; i++) {
			for (char j = i; j < arr.length; j++) {
				if(arr[i]>arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
				
			}
			
		}
		
	System.out.println("Ascending Character");
	for (char i = 0; i < arr.length; i++) {
		System.out.println(arr[i]);
		

}
	
	
	
	for (char i = 0; i < arr.length; i++) {
		for (char j = i; j < arr.length; j++) {
			if(arr[i]<arr[j]) {
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
			
		}
		
	}
	

	System.out.println("Descending Character");

	for (char i = 0; i < arr.length; i++) {
	System.out.println(arr[i]);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}}}
