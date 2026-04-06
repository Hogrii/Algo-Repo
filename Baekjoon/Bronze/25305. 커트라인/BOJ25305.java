import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ25305 {
	public static void main(String[] args) throws IOException{
		// 커트라인
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine(), " ");
		int N = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		int[] point = new int[N];
		
		st = new StringTokenizer(br.readLine(), " ");
		for(int i=0; i<point.length; i++) {
			point[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(point);
		System.out.println(point[N-k]);
	}
}
