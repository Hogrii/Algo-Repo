import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ2587 {
	public static void main(String[] args) throws IOException{
		// ´ëÇ¥°ª2
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		int N = 5;
		int[] arr = new int[5];
		int sum = 0;
		int rt = 0;
		int lt = N;
		
		for(int i=0; i<N; i++) {
			st = new StringTokenizer(br.readLine());
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(arr);
		
		for(int i=0; i<arr.length; i++) {
			sum += arr[i]; 
		}
		
		int avg = sum/N;
		System.out.println(avg);
		System.out.println(arr[N/2]);
	}
}
