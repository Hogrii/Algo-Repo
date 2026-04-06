import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class BOJ10815 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		HashMap<Integer, Integer> sameMap = new HashMap<Integer, Integer>();
		
		// 소유한 카드 개수
		int N = Integer.parseInt(br.readLine());
		int cardNum[] = new int[N];
		st = new StringTokenizer(br.readLine(), " ");
		
		// 소유한 카드 숫자
		for(int i=0; i<N; i++) {
			cardNum[i] = Integer.parseInt(st.nextToken());
		}
		
		// 비교할 카드 개수
		int M = Integer.parseInt(br.readLine());
		int compareCard[] = new int[M];
		st = new StringTokenizer(br.readLine(), " ");
		
		// 비교할 카드 숫자
		for(int i=0; i<M; i++) {
			compareCard[i] = Integer.parseInt(st.nextToken());
		}
		
		int exist = 1;
		for(int key : cardNum) {
			// 소유한 카드를 key값으로 value 1 지정
			if(!sameMap.containsKey(key)) {
				sameMap.put(key, exist);
			}
		}
		
		// 출력
		int ownCard = 0;
		for(int key : compareCard) {
			// 비교할 카드의 숫자가 소유한 카드의 key값과 동일하다면
			if(sameMap.containsKey(key)) {
				// value값을 가져와 출력
				ownCard = sameMap.get(key);
			// 동일하지 않다면
			}else {
				// 0을 출력
				ownCard = 0;
			}
			sb.append(ownCard).append(" ");
		}
		System.out.println(sb);		
	}
}
