import java.util.Scanner;

public class BOJ1929 {
	public static boolean[] prime;	
	// 에라토스테네스의 체
	public static void get_prime() {
		// 0과 1은 소수에서 제외
		prime[0] = prime[1] = true;
		// Max Number인 N의 제곱근과 같거나 작은 수의 배수를 제거
		for(int i=2; i<=Math.sqrt(prime.length); i++) {
			// prime[i] == true
			if(prime[i]) {
				continue;
			}
			// i의 제곱수부터 i의 배수에 해당하는 값들을 제거
			for(int j=i*i; j<prime.length; j+=i) {
				prime[j] = true;
			}
		}
	}
	
	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		int M = sc.nextInt();
		int N = sc.nextInt();
		
		prime = new boolean[N+1];
		get_prime();
		
		for(int i=M; i<=N; i++) {
			// prime[i] == false
			if(!prime[i]) {
				System.out.println(i);
			}
		}
	}
}

/*
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
StringTokenizer st = new StringTokenizer(br.readLine());
int M = Integer.parseInt(st.nextToken());	
int N = Integer.parseInt(st.nextToken());
		
boolean notPrime [] = new boolean[N+1];
notPrime[0] = notPrime[1] = true;
		
int sqrt = (int)Math.sqrt(N);
System.out.println("sqrt : " + sqrt);
for(int i=2; i<sqrt; i++) {
	for(int j=2; j<=N/i; j++) {
		if(notPrime[i*j] == true) {
			continue;
		}else {
			notPrime[i*j] = true;
		}
	}
}
for(int i=M; i<=N; i++) {
	if(notPrime[i] == false) {
		System.out.println(i);
	}
}
*/