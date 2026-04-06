import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ11051 {
	public static int divide = 10007;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		System.out.println((factorial(N)/(factorial(N-K)*factorial(K)))%divide);
	}
	
	public static int factorial(int N) {
		if(N<=1) {
			return 1;
		}
		return N*factorial(N-1);
	}
}
