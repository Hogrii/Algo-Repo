import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class BOJ1269 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		Set<Integer> setA = new HashSet<>();
		Set<Integer> setB = new HashSet<>();
		
		st = new StringTokenizer(br.readLine(), " ");
		// A집합 원소의 수
		int A = Integer.parseInt(st.nextToken());
		// B집합 원소의 수
		int B = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine(), " ");
		// A집합 원소들 입력
		for(int i=0; i<A; i++) {
			setA.add(Integer.parseInt(st.nextToken()));
		}
		
		st = new StringTokenizer(br.readLine(), " ");
		// B집합 원소들 입력
		for(int i=0; i<B; i++) {
			setB.add(Integer.parseInt(st.nextToken()));
		}
		
		// 대칭 차집합 카운트
		int SDS = 0;
		for(int key : setA) {
			// A집합의 값이 B집합에 없으면
			if(!setB.contains(key)) {
				// 대칭 차집합 +1
				SDS++;
			}
		}
		for(int key : setB) {
			// B집합의 값이 A집합에 없으면
			if(!setA.contains(key)) {
				// 대칭 차집합 +1
				SDS++;
			}
		}
		// 출력
		System.out.println(SDS);
	}
}
