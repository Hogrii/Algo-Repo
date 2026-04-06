import java.util.Scanner;

public class BOJ1110 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = N;
		int count = 0;
		while(true) {
			if (N>0 && N<10) {
				N = (N*10) + N;
			} else {
				if (((N/10) + (N%10)) >= 10) {
					N = ((N%10) * 10) + (((N/10) + (N%10)) % 10);
				} else {
					N = ((N%10) * 10) + ((N/10) + (N%10));
				} 
			}
			count++;
			if(M==N) {
				break;
			}
		}
		System.out.println(count);
	}
}