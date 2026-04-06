import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ1010 {
	public static void main(String[] args) throws IOException{
		// 다리 놓기
		// 진행중
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int T = Integer.parseInt(br.readLine());
				
		for(int i=0; i<T; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			int N = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());
			System.out.println(factorial(M)/(factorial(M-N)*factorial(N)));
		}
	}
	
	
	public static int factorial(int N) {
		if(N<=1) {
			return 1;
		}
		return N*factorial(N-1);
	}
}
