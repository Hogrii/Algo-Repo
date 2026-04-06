import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ10814 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		// 회원의 수
		int N = Integer.parseInt(br.readLine());
		// 회원 배열
		String arr[][] = new String[N][2];
		
		// 회원 정보 -> 나이, 이름
		for(int i=0; i<N; i++) {
			// " "을 기준으로 0에 나이, 1에 이름 입력
			st = new StringTokenizer(br.readLine(), " ");
			arr[i][0] = st.nextToken();
			arr[i][1] = st.nextToken();
		}
		
		// 정렬
		Arrays.sort(arr, (s1, s2) -> {
			// 나이순으로 정렬
			return Integer.parseInt(s1[0]) - Integer.parseInt(s2[0]);
		});
		
		// 출력
		for(int i=0; i<N; i++) {
			sb.append(arr[i][0]).append(" ").append(arr[i][1]).append('\n');
		}
		System.out.println(sb);
	}
}