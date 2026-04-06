import java.util.Scanner;

public class BOJ1193 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		int A = 1;
		int B = 1;
		int target = 1;
		
		wh: while(true) {
			if(X==1) {
				break;
			}
			if(A==1){
				B=B+1;
				target++;
				if(target==X) {break;}
				if(B!=1) {
					while(B>1){
						A++;
						B--;
						target++;
						if(target==X) {break wh;}
					}
				}
			}
			
			if(B==1){
				A=A+1;
				target++;
				if(target==X) {break;}
				while(A>1){
					A--;
					B++;
					target++;
					if(target==X) {break wh;}
				}
			}
		}		
		System.out.println(String.valueOf(A)+"/"+String.valueOf(B));
	}
}