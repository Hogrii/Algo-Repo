import java.util.Scanner;

public class BOJ2775 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();		
		
		int[][] APT = new int[15][15];
		 
		for(int i = 0; i < 15; i++) {
			APT[i][1] = 1;
			APT[0][i] = i;
		}
		
		for(int i=1; i<15; i++) {
			for(int j=2; j<15; j++) {
				APT[i][j] = APT[i-1][j] + APT[i][j-1];
			}
		}
		for(int i=0; i<T; i++) {
			int floor = sc.nextInt();
			int roomNum = sc.nextInt();
			System.out.println(APT[floor][roomNum]);
		}
	}
}