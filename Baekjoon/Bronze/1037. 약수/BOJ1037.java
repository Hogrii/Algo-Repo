import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ1037 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int divisorNum = Integer.parseInt(br.readLine());
		int divisor[] = new int[divisorNum];
		
		st = new StringTokenizer(br.readLine(), " ");
		
		for(int i=0; i<divisor.length; i++) {
			divisor[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(divisor);
		System.out.println(divisor[0]*divisor[divisorNum-1]);
	}
}
