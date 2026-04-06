import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ2566 {
	public static void main(String[] args) throws IOException{
		// 최댓값
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		// 격자판 생성
		int[][] board = new int[9][9];
		// 최대값 저장 변수
		int max = 0;
		// 좌표 저장 변수
		int x = 0, y = 0;
		
		// 격자판에 값 입력
		for(int i=0; i<9; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			for(int j=0; j<9; j++) {
				board[i][j] = Integer.parseInt(st.nextToken());
				// 최대값보다 격자판 값이 클 경우
				if(board[i][j]>max) {
					// 최대값 갱신
					max = board[i][j];
					// 좌표 갱신
					x = i;
					y = j;
				}
			}
		}
		// 격자판 시작이 1부터 시작이기 때문에 +1
		x++;
		y++;
		
		// 출력
		System.out.println(max);
		System.out.println(x + " " + y);
	}
}
