import java.util.Scanner;

public class BOJ2292 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int addBee = 0;
		int totalBee = 1;
		int route = 1;
		
		while(true) {
			if(N<=totalBee) {
				break;
			}else {
				addBee += 6;
				totalBee += addBee;
				route++;
			}
		}
		System.out.println(route);
	}
}