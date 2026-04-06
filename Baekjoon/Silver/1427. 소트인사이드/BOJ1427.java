import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ1427 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
		int M = N;
		int cnt = 0;
		
		while(M!=0) {
			M = M/10;
			cnt += 1;
		}
		int arr[] = new int[cnt];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = N%10;
			N = N/10;
		}
		
		Arrays.sort(arr);
		for(int i=cnt-1; i>=0; i--) {
			sb.append(arr[i]);
		}
		
		System.out.println(sb);
	}
}
