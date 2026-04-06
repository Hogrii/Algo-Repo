import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class BOJ1764 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		HashMap<String, String> matchMap = new HashMap<String, String>();
		
		st = new StringTokenizer(br.readLine(), " ");
		// 듣도 못한 사람의 수
		int N = Integer.parseInt(st.nextToken());
		// 보도 못한 사람의 수
		int M = Integer.parseInt(st.nextToken());
		
		String[] noListen = new String[N];
		String[] noSee = new String[M];
		
		// 듣도 못한 사람들
		for(int i=0; i<N; i++) {
			noListen[i] = br.readLine();
		}
		
		// 보도 못한 사람들
		for(int i=0; i<M; i++) {
			noSee[i] = br.readLine();
		}
		
		// 보도 못한 사람들 정렬
		Arrays.sort(noSee);
		
		// 듣도 못한 사람들을 key에 추가
		for(String key : noListen) {
			matchMap.put(key, key);
		}
		
		// 듣도 보도 못한 사람들 카운트
		int count = 0;
		for(String key : noSee) {
			// 보도 못한 사람의 이름이 key에 있다면 value를 출력
			// 듣도 보도 못한 사람들 카운트 +1
			if(matchMap.containsKey(key)) {
				sb.append(key).append('\n');
				count++;
			}
		}
		System.out.println(count);
		System.out.println(sb);
	}
}
