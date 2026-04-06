import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ1934 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int T = Integer.parseInt(br.readLine());
		for(int i=0; i<T; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());
			int min = ( A > B ) ? B : A;
			int gcf = 0;

			for(int j=1; j<=min; j++) {
				if(A%j==0 && B%j==0) {
					gcf = j;
				}
			}
			System.out.println(A*B/gcf);
		}

	}
}