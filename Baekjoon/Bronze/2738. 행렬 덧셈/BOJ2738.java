import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ2738 {
	public static void main(String[] args) throws IOException{
		// 행렬 덧셈
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		// 행렬 칸 생성
		st = new StringTokenizer(br.readLine(), " ");
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		// N * M 행렬 생성
		int[][] MatrixA = new int[N][M];
		int[][] MatrixB = new int[N][M];
		int[][] result = new int[N][M];
		
		// A 행렬 값 입력
		for(int i=0; i<N; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			for(int j=0; j<M; j++) {
				MatrixA[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		// B 행렬 값 입력
		for(int i=0; i<N; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			for(int j=0; j<M; j++) {
				MatrixB[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		// 행렬 합 출력
		for(int i=0; i<N; i++) {
			for(int j=0; j<M; j++) {
				result[i][j] = MatrixA[i][j] + MatrixB[i][j];
				System.out.print(result[i][j] + " ");
			}
			System.out.println();
		}
	}
}
