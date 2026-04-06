import java.util.Scanner;

public class BOJ2231 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int result = cons(N);
		System.out.println(result);
	}
	
	public static int cons(int N) {
		for(int i=1; i<N; i++) {
			// 생성자를 확인하기 위한 변수
			int sum = i;
			// while문에 제약을 걸기 위한 변수
			int j= i;
			while(j != 0) {
				sum = sum + (j%10);
				j = j/10;
			}
			// sum이 N과 같다면 생성자 i 리턴
			if(sum==N) {
				return i;
			}
		}
		// 생성자가 없다면 0 리턴
		return 0;
	}
}