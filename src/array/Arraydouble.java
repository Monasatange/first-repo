package array;

public class Arraydouble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double []arr= {5.7,13, 10.2,99.1,14.5,80.7};
		
		System.out.println(arr.length);
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
			
		}
		
		double temp;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i; j < arr.length; j++) {
				
				if(arr[i]>arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
				
			}
			
		}
		System.out.println("Ascending number");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
	}
		
	
		for (int i = 0; i < arr.length; i++) {
			for (int j = i; j < arr.length; j++) {
				
				if(arr[i]<arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
				
			}
			
		}
		System.out.println("Descending number");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
	}
		
	
	
	
	
	
	}
}
