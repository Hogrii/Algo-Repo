import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.StringTokenizer;

public class BOJ1620 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		HashMap<String, Integer> pokeMap = new HashMap<String, Integer>();
		
		// 도감에 수록된 포켓몬의 수
		st = new StringTokenizer(br.readLine(), " ");
		int N = Integer.parseInt(st.nextToken());
		String pokeDex[] = new String[N];
		
		// 맞춰야할 문제의 수
		int M = Integer.parseInt(st.nextToken());
		ArrayList<String> pokeCheck = new ArrayList<>();
		
		// 포켓몬 도감 입력
		for(int i=0; i<N; i++) {
			st = new StringTokenizer(br.readLine());
			pokeDex[i] = st.nextToken();
		}
		
		// 맞춰야할 문제 입력
		for(int i=0; i<M; i++) {
			st = new StringTokenizer(br.readLine());
			pokeCheck.add(st.nextToken());
		}
		
		// 포켓몬 도감은 1번부터 시작
		int pokeDexNum = 1;
		for(String key : pokeDex) {
			// 포켓몬을 번호에 저장
			pokeMap.put(key, pokeDexNum);
			// 저장 후 다음 도감 번호를 위해 증가
			pokeDexNum++;
		}
		
		// 포켓몬 도감 출력
		for(String key : pokeCheck) {
			// 맞춰야할 문제가 문자열 또는 숫자로 입력되기 때문에 구별이 필요
			if(isInteger(key)) {
				// 입력된 값이 숫자라면 int형으로 변환
				int poketNum = Integer.parseInt(key);
				// 도감은 1부터 시작, 배열은 0부터 시작이기 때문에 1을 빼준다.
				sb.append(pokeDex[poketNum-1]).append('\n');
			}else {
				// 입력된 값이 문자열이라면 key값을 이용해 포켓몬 도감에서 번호를 출력
				int poketMon = pokeMap.get(key);
				sb.append(poketMon).append('\n');
			}
		}
		// 출력
		System.out.println(sb);
	}
	
	// 입력된 값이 문자열인지 숫자인지 구분하기 위한 메소드
	public static boolean isInteger(String pokeCheck) {
		try {
			// 입력된 값이 숫자면 true 반환
			Integer.parseInt(pokeCheck);
			return true;
		}catch(Exception e) {
			// 입력된 값이 문자열이면 false 반환
			return false;
		}
	}
}
