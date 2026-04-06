import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class BOJ18870 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		HashMap<Integer, Integer> rankingMap = new HashMap<Integer, Integer>();
		
		// 좌표의 수
		int N = Integer.parseInt(br.readLine());
		// 좌표 배열
		int ori[] = new int[N];
		// 좌표 정렬 배열
		int sort[] = new int[N];
		
		// 좌표값 입력
		st = new StringTokenizer(br.readLine(), " ");
		
		// 좌표 배열, 좌표 정렬 배열에 값 입력
		for(int i=0; i<N; i++) {
			ori[i] = sort[i] = Integer.parseInt(st.nextToken());			
		}
		
		// 좌표 정렬
		Arrays.sort(sort);
		
		// key 값에 넣을 랭킹 값
		int rank = 0;
		for(int key : sort) {
			// 랭킹 중복 제거
			if(!rankingMap.containsKey(key)) {
				// 해당 key 값에 랭킹 값 입력
				rankingMap.put(key, rank);
				// 랭킹 입력 후 +1 추가
				rank++;
			}
		}
		
		// 출력
		// 좌표값에 랭킹 가져오기
		for(int key : ori) {
			// map에서 랭킹 key값을 통해 랭킹 value 가져오기
			int ranking = rankingMap.get(key);
			sb.append(ranking).append(" ");			
		}
		System.out.println(sb);
	}
}