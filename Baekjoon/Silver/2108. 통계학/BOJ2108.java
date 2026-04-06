import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class BOJ2108 {
	public static void main(String[] args) throws IOException{
		// 통계학
		// 실패
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int arr[] = new int[Integer.parseInt(br.readLine())];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		br.close();

		ArrayList<Integer> list = new ArrayList<>();
		Arrays.sort(arr);
		
		int first = 0;
		
		// 산술평균
		for(int i=0; i<arr.length; i++) {
			first += arr[i];
			if(i==arr.length-1) {
				first = Math.round(first/arr.length);
				list.add(first);
			}
		}		
		
		// 중앙값
		list.add(arr[arr.length/2]);
		
		// 최빈값
		if(arr.length == 1) {
			list.add(arr[0]);
		}else {
			list.add(arr[1]);
		}
		
		// 범위
		list.add(arr[arr.length-1]-arr[0]);

		for(int result : list) {
			sb.append(result).append('\n');
		}
		System.out.println(sb);
	}
}
