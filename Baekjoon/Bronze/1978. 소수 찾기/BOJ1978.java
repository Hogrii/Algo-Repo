import java.util.Scanner;

public class BOJ1978 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] primeNum = new int[N];
		int count = 0;
		int moduleCount = 0;
		
		for(int i=0; i<N; i++) {
			primeNum[i] = sc.nextInt();
		}
		
		for(int i=0; i<N; i++) {
			for(int j=1; j<primeNum[i]+1; j++) {
				if(primeNum[i]==1) {
					continue;
				}else {
					if(primeNum[i]%j == 0) {
						moduleCount++;
					}
				}
			}
			if(moduleCount==2) {
				count++;
				moduleCount = 0;
			}else {
				moduleCount = 0;
			}
		}
		System.out.println(count);
	}
}