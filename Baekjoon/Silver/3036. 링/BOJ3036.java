import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ3036 {
	public static void main(String[] args) throws IOException{
		// 이항 계수 2
		// 실패
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine());

		st = new StringTokenizer(br.readLine(), " ");
		
		int firstRing = Integer.parseInt(st.nextToken());
		
		for(int i=1; i<N; i++) {
			int otherRing = Integer.parseInt(st.nextToken());
			
			int gcfVal = gcf(firstRing, otherRing);
			sb.append(firstRing/gcfVal).append("/").append(otherRing/gcfVal).append('\n');
		}
		System.out.println(sb);		
	}
	
	// 최대공약수 메소드
	public static int gcf(int a, int b) {		
		while(b != 0) {
			int r = a%b;
			a = b;
			b = r;
		}
		return a;
	}
}
