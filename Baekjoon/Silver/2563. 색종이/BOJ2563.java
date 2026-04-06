import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ2563 {
	public static void main(String[] args) throws IOException{
		// 색종이
		// 1. 가로, 세로 100칸짜리 배열을 만든다.
		// 2. 각 색종이의 영역을 색칠한다.
		// 3. 색칠된 영역을 출력한다.
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		// 가로, 세로 100칸 도화지
		int[][] whitePaper = new int[100][100];
		
		// 색종이 수
		int N = Integer.parseInt(br.readLine());
		
		// 색종이로 가려진 영역
		int covered = 0;
		
		// 색종이 영역 구하기
		for(int i=0; i<N; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			// 색종이 x좌표
			int x = Integer.parseInt(st.nextToken());
			// 색종이 y좌표
			int y = Integer.parseInt(st.nextToken());
			
			for(int j=x; j<x+10; j++) {
				for(int k=y; k<y+10; k++) {
					// 색종이의 영역이 아닐 때
					if(whitePaper[j][k] != 1) {
						// 영역 추가
						whitePaper[j][k] = 1;
						// 영역 카운트
						covered++;
					}
				}
			}
		}
		// 출력
		System.out.println(covered);
	}
}