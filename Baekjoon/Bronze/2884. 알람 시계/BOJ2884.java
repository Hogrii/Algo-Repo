import java.util.Scanner;

public class BOJ2884 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int hour;
		int minute;
		hour = sc.nextInt();
		minute = sc.nextInt();
		minute = minute - 45;
		if(minute<0) {
			hour = hour - 1;
			minute = minute + 60;
			if(hour<0) {
				hour = hour + 24;
			}
		}
		System.out.println(hour + " " + minute);
	}
}
