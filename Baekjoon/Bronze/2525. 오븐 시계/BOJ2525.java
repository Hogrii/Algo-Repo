import java.util.Scanner;

public class BOJ2525 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int hour;
		int minute;
		int time;
		hour = sc.nextInt();
		minute = sc.nextInt();
		time = sc.nextInt();
		
		minute = minute + time;
		if(minute>59) {			
			hour = hour + (minute/60);
			minute = minute - (60*(minute/60));
			if(hour>23) {
				hour = hour - 24;
			}
		}
		System.out.println(hour + " " + minute);
	}
}
