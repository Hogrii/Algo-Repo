import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ25501 {
	public static int cnt = 0;
	public static int recursion(String S, int l, int r) {
		cnt++;
		if(l >= r) return 1;
		else if(S.charAt(l) != S.charAt(r)) return 0;
		else return recursion(S, l+1, r-1);
	}
	
	public static int isPalindrome(String S) {
		return recursion(S, 0, S.length()-1);
	}
	
	public static void main(String[] args) throws IOException{
		// ¿Á±Õ¿« ±Õ¿Á
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		for(int i=0; i<T; i++) {
			String S = br.readLine();
			System.out.println(isPalindrome(S) + " " + cnt);
			cnt = 0;
		}
	}
}
