import java.util.Scanner;

public class BOJ4344 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int C = sc.nextInt();	

		for (int j = 0; j < C; j++) {			
			int N = sc.nextInt();
			int[] score = new int[N];
			int count = 0;		
			int sum = 0;
			
			for (int i = 0; i < score.length; i++) {
				score[i] = sc.nextInt();
				sum = sum + score[i];
			}
			int avg = sum / N;

			for (int i = 0; i < score.length; i++) {
				if (score[i] > avg) {
					count++;
				}
			}
			System.out.println(String.format("%.3f", (((double) count / N) * 100)) + "%");
			
		}
	}
}