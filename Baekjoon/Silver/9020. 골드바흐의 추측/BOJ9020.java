import java.util.Scanner;

public class BOJ9020 {
	public static boolean[] prime = new boolean[10001];
	public static void get_prime() {
		prime[0] = prime[1] = true;
		for(int i=2; i<=Math.sqrt(prime.length); i++) {
			if(prime[i]) continue;
			for(int j=i*i; j<prime.length; j+=i) {
				prime[j] = true;
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		get_prime();
		int T = sc.nextInt();
		for(int i=0; i<T; i++) {
			int n = sc.nextInt();
			int first = n/2;
			int second = n/2;
			
			while(true) {
				if(!prime[first] && !prime[second]) {
					System.out.println(first + " " + second);
					break;
				}else {
					first--;
					second++;
				}
			}
		}
	}
}