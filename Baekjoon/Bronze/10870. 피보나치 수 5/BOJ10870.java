import java.util.Scanner;

public class BOJ10870 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] fibonacci = new int[n+1];
		
		if(n==0) {
			fibonacci[0] = 0;
			System.out.println(fibonacci[n]);
		}else {
			fibonacci[0] = 0;
			fibonacci[1] = 1;
			for(int i=2; i<fibonacci.length; i++) {
				fibonacci[i] = fibonacci[i-2]+fibonacci[i-1];
			}
			System.out.println(fibonacci[n]);
		}
	}
}