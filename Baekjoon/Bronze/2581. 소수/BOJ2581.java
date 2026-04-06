import java.util.Scanner;

public class BOJ2581 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int M = sc.nextInt();
		int N = sc.nextInt();
		int inputNum = M;
		int moduleCount = 0;
		int primeSum = 0;
		int primeMin = 0;
		int[] numbers = new int[N-M+1];
		for(int i=0; i<N-M+1; i++) {
			numbers[i] = inputNum;
			inputNum++;
		}
		
		for(int i=0; i<N-M+1; i++) {
			for(int j=1; j<numbers[i]+1; j++) {
				if(numbers[i]==1) {
					continue;
				}else {
					if(numbers[i]%j == 0) {
						moduleCount++;
					}
				}
			}
			if(moduleCount==2) {
				primeSum = primeSum + numbers[i];
				if(primeMin == 0) {
					primeMin = numbers[i];					
				}
				moduleCount = 0;
			}else {
				moduleCount = 0;
			}
		}
		if(primeSum == 0) {
			System.out.println("-1");
		}else {
			System.out.println(primeSum);
			System.out.println(primeMin);
		}		
	}
}