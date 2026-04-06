import java.util.Scanner;

public class BOJ7568 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[][] body = new int[N][2];
		int[] ranking = new int[N];
		
		for(int i=0; i<N; i++) {
			// ¸ö¹«°Ô
			body[i][0] = sc.nextInt();
			// Å°
			body[i][1] = sc.nextInt();
		}
		
		for(int i=0; i<N; i++) {
			// ·©Å· °ª
			int rank = 1;
			for(int j=0; j<N; j++) {
				if(i==j) continue;
				
				if(body[i][0]<body[j][0] && body[i][1]<body[j][1]) {
					rank++;
				}
			}
			// ·©Å· ÀÔ·Â
			ranking[i] = rank;
		}
		
		for(int i=0; i<N; i++) {
			System.out.println(ranking[i]);
		}		
	}
}