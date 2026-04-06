import java.util.Scanner;

public class BOJ1009 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		int[] answer = new int[T];

		for(int i = 0; i < T; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int result = a;

			if (a == 0) {
				answer[i] = 1;
				continue;
			}

			if (b == 1) {
				result = a%10;
			}else {
				for(int j = 1; j < b; j++) {
					result = result*a%10;
				}
			}

			if (result == 0)
				answer[i] = 10;
			else
				answer[i] = result;
		}

		for(int i = 0; i < T; i++) {
			System.out.println(answer[i]);
		}
	}
}
