import java.util.Scanner;

public class BOJ10250 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int i=0; i<T; i++) {
			int floor = sc.nextInt();
			int roomNum = sc.nextInt();
			int guest = sc.nextInt();
			int count = 0;
			
			for(int j=1; j<roomNum+1; j++) {
				for(int k=1; k<floor+1; k++) {
					count++;
					if(count==guest) {
						System.out.println(k*100 + j);
					}
				}
			}
		}
	}
}