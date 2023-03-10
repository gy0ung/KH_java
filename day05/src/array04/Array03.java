package array04;

public class Array03 {

	public static void main(String[] args) {
		int[] arr1 = {39,34,29,67,19,95,38,75,4,68};
		
		int max = arr1[0]; 
		int min = arr1[0]; 
		
		for(int i =1; i<arr1.length; i++) {
			if(max < arr1[i]) {
				max = arr1[i];
			}
			if(min > arr1[i]) {
				min = arr1[i];
			}
		}
		System.out.println("가장 큰 수 : " + max);
		System.out.println("가장 작은 수 : " + min);
		
		
	}

}
