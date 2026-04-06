import java.util.Scanner;

public class BOJ1065 {
	public static int x(int N) {
		
		int count = 0;
		for(int i=1; i<N+1; i++) {
			if(i>0 && i<100) {
				count++;
			}else if(i>=100 && i<1000) {
				int third = (i%1000)/100;
				int second = (i%100)/10;
				int first = i%10;
				
				if((third-second)==(second-first)) {
					count++;
				}
			}else if(i>=1000) {
				int fourth = (i%10000)/1000;
				int third = (i%1000)/100;
				int second = (i%100)/10;
				int first = i%10;
				
				if((fourth-third)==(third-second)&&(third-second)==(second-first)) {
					count++;
				}
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		System.out.println(x(N));
	}
}