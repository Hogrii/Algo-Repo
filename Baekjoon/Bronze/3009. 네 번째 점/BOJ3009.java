import java.util.Scanner;

public class BOJ3009 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arrX = new int[3];
		int[] arrY = new int[3];
		int countX = 0;
		int countY = 0;
		int x=0;
		int y=0;
		for(int i=0; i<arrX.length; i++) {
			arrX[i] = sc.nextInt();
			arrY[i] = sc.nextInt();
		}
		
		for(int i=1; i<arrX.length; i++) {
			if(arrX[0]==arrX[i]) {
				countX++;
			}else {
				x = arrX[i];
			}
			if(arrY[0]==arrY[i]) {
				countY++;
			}else {
				y = arrY[i];
			}
		}
		
		if(countX==0 && countY==0) {
			System.out.println(arrX[0] + " " + arrY[0]);
		}else if(countX==1 && countY==0) {
			System.out.println(x + " " + arrY[0]);
		}else if(countX==0 && countY==1){
			System.out.println(arrX[0] + " " + y);
		}else if(countX==1 && countY==1){
			System.out.println(x + " " + y);
		}
	}
}
