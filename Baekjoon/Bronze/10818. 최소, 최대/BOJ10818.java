import java.util.Scanner;

public class BOJ10818 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] Array = new int[N];
		for(int i=0; i<N; i++) {
			Array[i] = sc.nextInt();
		}
		int min = Array[0];
		int max = Array[0];
		for(int i=1; i<Array.length; i++) {
			if(min>Array[i]) {
				min = Array[i];
			}
			if(max<Array[i]) {
				max = Array[i];
			}
		}
		System.out.println(min + " " + max);
	}
}