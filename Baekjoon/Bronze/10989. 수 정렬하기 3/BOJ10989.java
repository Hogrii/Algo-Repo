import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ10989 {
	public static void main(String[] args) throws IOException{
		// BufferedReader를 이용하면 Scanner보다 처리 속도가 빠르다.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// StringBuilder를 이용하면 문자열을 다루기가 더 쉽다.
		StringBuilder sb = new StringBuilder();
		
		// 수의 개수
		int arr[] = new int[Integer.parseInt(br.readLine())];
		
		// 정렬할 숫자들
		for(int i=0; i<arr.length; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		// 입력 후 BufferedReader를 닫아준다.
		br.close();
		
		// 정렬
		Arrays.sort(arr);
		
		// 출력
		for(int i=0; i<arr.length; i++) {
			sb.append(arr[i]).append('\n');
		}		
		System.out.println(sb);
	}
}