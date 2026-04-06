import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ25304 {
	public static void main(String[] args) throws IOException{
		// ¿µ¼öÁõ
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		int totalPrice = Integer.parseInt(br.readLine());
		int buyCnt = Integer.parseInt(br.readLine());
		
		while(buyCnt-->0) {
			st = new StringTokenizer(br.readLine(), " ");
			int buyPrice = Integer.parseInt(st.nextToken());
			int thingCnt = Integer.parseInt(st.nextToken());
			
			totalPrice = totalPrice - (buyPrice*thingCnt);
		}
		
		if(totalPrice == 0) System.out.println("Yes");
		else System.out.println("No");
		
	}
}
