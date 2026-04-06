import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class BOJ14425 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		HashMap<String, Integer> checkMap = new HashMap<String, Integer>();
		
		st = new StringTokenizer(br.readLine(), " ");
		// 집합 S의 문자열 수
		int N = Integer.parseInt(st.nextToken());		
		String strSet[] = new String[N];
		// 검사할 문자열 수
		int M = Integer.parseInt(st.nextToken());
		String strCheck[] = new String[M];
		
		// 집합 S의 문자열 입력
		for(int i=0; i<N; i++) {
			strSet[i] = br.readLine();
		}
		
		// 검사할 문자열 입력
		for(int i=0; i<M; i++) {
			strCheck[i] = br.readLine();
		}
		
		// key에 집합 S의 문자열을 입력, value에 1 입력
		for(String key : strSet) {
			checkMap.put(key, 1);
		}
		
		// 일치하는 문자열의 수를 담을 변수
		int exist = 0;
		for(String key : strCheck) {
			// checkMap에 검사할 문자열이 key에 등록이 되어있다면
			if(checkMap.containsKey(key)) {
				// 존재하기 때문에 +1
				exist++;
			}
		}
		// 출력
		System.out.println(exist);
	}
}
