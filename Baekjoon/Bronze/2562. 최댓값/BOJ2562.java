import java.util.Scanner;

public class BOJ2562 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] N = new int[9];
		int count = 1;
		for(int i=0; i<N.length; i++) {
			N[i] = sc.nextInt();
		}
		int max = N[0];
		for(int i=1; i<N.length; i++) {
			if(max<N[i]) {
				max = N[i];
				count = i+1;
			}
		}
		System.out.println(max);
		System.out.println(count);
	}
}