import java.util.Scanner;

public class BOJ1018 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.nextLine());
		int M = Integer.parseInt(sc.nextLine());
		String[][] chessBoard = new String[N][M];
		
		for(int i=0; i<N; i++) {
			for(int j=0; j<M; j++) {
				chessBoard[i][j] = sc.nextLine();
			}
		}
		int count = confirm(chessBoard, N, M);
		System.out.println(count);
	}
	
	public static int confirm(String[][] chessBoard, int N, int M) {
		
		int count = 0;
		for(int i=0; i<N; i++) {
			for(int j=0; j<M; j++) {
				
			}
		}
		return count;
	}
}