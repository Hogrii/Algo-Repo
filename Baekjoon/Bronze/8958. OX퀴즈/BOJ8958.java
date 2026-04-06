import java.util.Scanner;

public class BOJ8958 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = Integer.parseInt(sc.nextLine());
		int sum = 0;
		int count = 0;
		for(int i=0; i<T; i++) {
			String str = sc.nextLine();
			for(int j=0; j<str.length(); j++) {
				if(str.charAt(j)=='O') {
					count++;
					sum = sum + count;
				}else {
					count = 0;
				}
			}
			System.out.println(sum);
			sum = 0;
			count = 0;
		}
	}
}
