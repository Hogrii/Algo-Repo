
import java.util.Scanner;

public class BOJ11729 {
 
	public static StringBuilder sb = new StringBuilder(); 
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		// 원반의 수
		int N = in.nextInt();

		// 원반 옮기기 경우의 수
		sb.append((int) (Math.pow(2, N) - 1)).append('\n');
 
		// 원반 옮기기
		HanoiMove(N, 1, 2, 3);
		System.out.println(sb);
 
	}
 
	public static void HanoiMove(int N, int start, int mid, int to) {
		// 원반이 1개 남았을 때
		if (N == 1) {
			sb.append(start + " " + to + "\n");
			return;
		} 

		// N-1개를 A에서 B로 이동 (= start 지점의 N-1개의 원판을 mid 지점으로 옮긴다.)
		HanoiMove(N - 1, start, to, mid);
    
		// 1개를 A에서 C로 이동 (= start 지점의 N번째 원판을 to지점으로 옮긴다.)
		sb.append(start + " " + to + "\n");
    
		// N-1개를 B에서 C로 이동 (= mid 지점의 N-1개의 원판을 to 지점으로 옮긴다.)
		HanoiMove(N - 1, mid, start, to); 
	}
}