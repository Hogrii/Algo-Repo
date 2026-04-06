import java.util.Scanner;

public class BOJ11720 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		String str = sc.nextLine();
		int sum = 0;
		for(int i=0; i<str.length(); i++) {
			sum = sum + (str.charAt(i)-48);
		}
		System.out.println(sum);
	}
}