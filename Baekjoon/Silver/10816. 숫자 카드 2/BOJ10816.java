import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class BOJ10816 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		HashMap<Integer, Integer> cardMap = new HashMap<Integer, Integer>();
		
		// 소유하고 있는 카드의 수
		int N = Integer.parseInt(br.readLine());
		int CardNum[] = new int[N];
		st = new StringTokenizer(br.readLine(), " ");
		
		// 소유 카드의 숫자들
		for(int i=0; i<N; i++) {
			CardNum[i] = Integer.parseInt(st.nextToken()); 
		}
		
		// 비교할 카드의 수
		int M = Integer.parseInt(br.readLine());
		int CompareCard[] = new int[M];
		st = new StringTokenizer(br.readLine(), " ");
		
		// 비교할 카드의 숫자들
		for(int i=0; i<M; i++) {
			CompareCard[i] = Integer.parseInt(st.nextToken());
		}
		
		// 소유한 카드를 정렬
		Arrays.sort(CardNum);
		
		// 같은 숫자 카드 카운트
		int stack = 1;
		for(int i=0; i<CardNum.length; i++) {
			int exist = 1;
			int key = CardNum[i];
			// 중복된 카드가 2장 이상일 경우
			if(cardMap.containsKey(key)) {
				stack++;
				cardMap.put(key, stack);
			// 중복된 카드가 없을 경우
			}else {
				cardMap.put(key, exist);
				// 스택을 1로 초기화
				stack = 1;
			}
		}
		
		// 갖고 있는 카드의 수 출력
		int ownCard = 0;
		for(int key : CompareCard) {
			// key에 등록된 카드가 있다면 그 value를 출력
			if(cardMap.containsKey(key)) {
				ownCard = cardMap.get(key);
				sb.append(ownCard).append(" ");
			// key에 등록된 카드가 없다면 0을 출력
			}else {
				sb.append(0).append(" ");
			}
		}
		System.out.println(sb);
	}
}
