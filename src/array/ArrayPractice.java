package array;

public class ArrayPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] arr = {48,64,89,36,56,78,32,46,20};
		System.out.println("Array Length " +      arr.length);
		
		System.out.println("Original Array Number");
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
			}
		int temp;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i; j < arr.length; j++) {
				if(arr[i] > arr[j]) {
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
			
		}
		}
		System.out.println("Ascending Array Number ");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);

		}
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = i; j < arr.length; j++) {
				if(arr[i] < arr[j]) {
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
			
		}
		}
		System.out.println("Descending Array Number ");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
	
	
	
	
	}}}

