import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ1181 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		// 단어의 수
		int N = Integer.parseInt(br.readLine());
		// 단어 배열
		String arr[] = new String[N];
		
		// 단어 입력
		for(int i=0; i<N; i++) {
			arr[i] = br.readLine();
		}
		
		// 단어 정렬
		Arrays.sort(arr, (s1, s2) -> {
			// 단어의 길이가 같으면
			if(s1.length() == s2.length()) {
				// 두 단어의 알파벳 순서 비교
				return s1.compareTo(s2);
			// 단어의 길이가 다르면
			}else {
				// 단어의 순서를 정렬 -> 음수, 0, 양수
				return s1.length() - s2.length();
			}
		});
		
		// 첫번째 단어 출력
		sb.append(arr[0]).append('\n');
		// 두번째부터 마지막까지 중복 제거 후 출력
		for(int i=1; i<arr.length; i++) {
			if(!arr[i].equals(arr[i-1])) {
				sb.append(arr[i]).append('\n');				
			}
		}
		System.out.println(sb);		
	}
}
