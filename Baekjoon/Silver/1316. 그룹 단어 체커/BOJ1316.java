import java.util.Scanner;
 
public class BOJ1316 { 
	static Scanner sc = new Scanner(System.in); 
	public static boolean group() {
		boolean[] conf = new boolean[26];
		int prev = 0;
		String str = sc.nextLine();
		
		for(int i=0; i<str.length(); i++) {
			int now = str.charAt(i);
			
			if(prev != now) {
				if(conf[now - 'a'] == false) {
					conf[now - 'a'] = true;
					prev = now;
				}else {
					return false;
				}
			}
		}
		return true;
	} 
	
	public static void main(String[] args) { 
		int N = Integer.parseInt(sc.nextLine());
		int count = 0;
 
		for (int i=0; i<N; i++) {
			if (group() == true) {
				count++;
			}
		}
		System.out.println(count);
	}
}