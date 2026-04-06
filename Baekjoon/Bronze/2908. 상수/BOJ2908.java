import java.util.Scanner;

public class BOJ2908 {
	public static int d(int num) {
	
		int result = 0;
		while(num!=0) {			
			result = result + (num%10)*(int)(Math.pow(10, (int)(Math.log10(num)+1)-1));
			num = num/10;
		}
		return result;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();

		A = d(A);
		B = d(B);
		
		if(A>B) {
			System.out.println(A);
		}else {
			System.out.println(B);
		}
				
	}
}
