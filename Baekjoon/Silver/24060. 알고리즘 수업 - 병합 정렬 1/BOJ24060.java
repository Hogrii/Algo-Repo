import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ24060 {
	private static int A;
	private static int K;
	private static int[] arr;
	private static int[] tmp;
	private static int cnt = 0;
	private static int result = -1;
	public void merge(int[] arr, int p, int q, int r) {
		int i = p;
		int j = q+1;
		int t = 0;
		
		while(i <= q && j <= r) {
			if(arr[i] <= arr[j]) {
				tmp[t++] = arr[i++];
			}
			else {
				tmp[t++] = arr[j++];
			}
		}
		
		while(i <= q) tmp[t++] = arr[i++];
		while(j <= r) tmp[t++] = arr[j++];
		
		i = p;
		t = 0;
		
		while(i <= r) {
			cnt++;
			if(cnt==K) {
				result = tmp[t];
				break;
			}
			arr[i++] = tmp[t++];
		}
	}
	
	public void merge_sort(int[] arr, int p, int r) {
		if(p < r) {
			 int q = (p+r)/2;
			 merge_sort(arr, p, q);
			 merge_sort(arr, q+1, r);
			 merge(arr, p, q, r);
		}
	}
	
	public static void main(String[] args) throws IOException{
		// 알고리즘 수업 - 병합 정렬 1
		
		BOJ24060 Boj24060 = new BOJ24060();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine(), " ");
		A = Integer.parseInt(st.nextToken());
		arr = new int[A];
		tmp = new int[A];
		K = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine(), " ");
		for(int i=0; i<arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		int p = 0;
		int r = arr.length-1;
		
		Boj24060.merge_sort(arr, p, r);
		System.out.println(result);
	}
}
