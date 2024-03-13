import java.util.Scanner;

public class NumericArray {
	
	public static void sort(double[] arr, int n) {
		for(int i = 0; i < n-1; i++) {
			for(int j = i + 1; j < n; j++) {
				if(arr[i] > arr[j]) {
					double tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements you want to store: ");
		int n = sc.nextInt();
		double[] arr = new double[n];
		double sum = 0;
		double avg = 0;
		for(int i = 0; i < n; i++) {
			System.out.print("a["+i+"] = ");
			arr[i] = sc.nextInt();
			sum+=arr[i];
		}
		avg = sum/n;
		sort(arr, n);
		System.out.println("Sorted array: ");
		for(int i = 0; i < n; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println("\nSum: " + sum);
		System.out.println("Average: " + avg);
		
	}
}
