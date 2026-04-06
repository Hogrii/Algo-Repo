import java.util.Scanner;

public class BOJ4948 {
	public static boolean prime[];
	public static void get_prime() {
		prime[0] = prime[1] = true;
		for (int i=2; i<=Math.sqrt(prime.length); i++) {
			if (prime[i])
				continue;
			for (int j=i*i; j<prime.length; j+=i) {
				prime[j] = true;
			}
		}
	}

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int N;
		int count = 0;
		wh: while (true) {
			N = sc.nextInt();
			if (N==0) {
				break wh;
			}
			prime = new boolean[2*N + 1];
			get_prime();

			for (int i=N+1; i<=2*N; i++) {
				if (!prime[i]) {
					count++;
				}					
			}
			System.out.println(count);
			count = 0;
		}
	}
}