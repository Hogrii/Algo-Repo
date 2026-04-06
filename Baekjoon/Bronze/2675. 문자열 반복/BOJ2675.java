import java.util.Scanner;

public class BOJ2675 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int i=0; i<T; i++) {
			int R = sc.nextInt();
			String str = sc.next();
			String[] strRepeat = new String[str.length()*R];
			for(int j=0; j<str.length(); j++) {
				String substr = str.substring(j, j+1);
				for(int k=0; k<R; k++) {
					strRepeat[k] = substr;
					System.out.print(strRepeat[k]);
				}
			}
			System.out.println();
		}
	}
}