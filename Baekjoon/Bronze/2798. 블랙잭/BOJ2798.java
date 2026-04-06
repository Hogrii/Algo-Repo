import java.util.Scanner;

public class BOJ2798 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[] arr = new int[N];
		
		for(int i=0; i<N; i++) {
			arr[i] = sc.nextInt();
		}
		
		// M을 넘지 않으면서 M에 가까운 카드 3장의 합
		int result = sum(arr, N, M);
		System.out.println(result);	
	}
	
	public static int sum(int[] arr, int N, int M) {
		int result = 0;
		
		// 첫번째 카드는 N-2를 넘지 않는다.
		for(int i=0; i<N-2; i++) {
			// 두번째 카드는 첫번째 카드보다 크고 N-1을 넘지 않는다.
			for(int j=i+1; j<N-1; j++) {
				// 세번째 카드는 두번째 카드보다 크고 N을 넘지 않는다.
				for(int k=j+1; k<N; k++) {
					int sum = arr[i] + arr[j] + arr[k];
					// 합이 M과 같은 경우
					if(sum == M) {
						return sum;
					}
					// 합이 이전 합보다 크고 M보다 작은 경우
					if(result<sum && sum<M) {
						result = sum;
					}
				}
			}
		}
		return result;
	}
}