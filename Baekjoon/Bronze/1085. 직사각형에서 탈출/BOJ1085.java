import java.util.Scanner;

public class BOJ1085 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int w = sc.nextInt();
		int h = sc.nextInt();
		
		int[] distance = new int[] {x,y,w-x,h-y};
		int min = distance[0];
		
		for(int i=1; i<distance.length; i++) {
			if(min>distance[i]) {
				min = distance[i];
			}
		}
		System.out.println(min);
		
	}
}