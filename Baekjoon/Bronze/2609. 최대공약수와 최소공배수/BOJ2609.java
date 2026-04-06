import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ2609 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine(), " ");
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int min = ( A > B ) ? B : A;
		int gcf = 0;
		
		for(int i=1; i<=min; i++) {
			if(A%i==0 && B%i==0) {
				gcf = i;
			}
		}
		System.out.println(gcf);
		System.out.println(A*B/gcf);
	}
}
