import java.util.Scanner;

public class BOJ15596 {
	public static long sum(int[] a) {
		long sum = 0;
		for(int i=0; i<a.length; i++) {
			sum = sum + a[i];
		}		
		return sum;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] a =  new int[n];
		
		for(int i=0; i<a.length; i++) {
			a[i] = i+1;
		}
		
		long sum = sum(a);
		System.out.println(sum);
	}
}