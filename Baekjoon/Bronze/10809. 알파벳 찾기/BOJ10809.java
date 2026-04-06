import java.util.Scanner;

public class BOJ10809 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.nextLine();
		String[] location = new String[26];
		
		for(int i=0; i<location.length; i++) {
			location[i] = "-1";
		}
		
		for(int i=0; i<S.length(); i++) {
			int S2 = S.charAt(i)-97;
			
			if(S2<26 && S2>=0) {
				if(location[S2].equals("-1")) {
					location[S2] = String.valueOf(i);					
				}
			}
		}
		
		for(int i=0; i<location.length; i++) {
			System.out.println(location[i]);
		}
	}
}