import java.util.Scanner;

public class BOJ1157 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// A~Z까지의 배열 생성
		int alpha[] = new int[26];
		String vocaInput = sc.next();
		for (int i = 0; i < vocaInput.length(); i++) {
			if((int)vocaInput.charAt(i)>96 && (int)vocaInput.charAt(i)<123) {
				char vocaCount = vocaInput.toUpperCase().charAt(i);				
				alpha[vocaCount - 'A']++;
			}else {
				char vocaCount = vocaInput.charAt(i);				
				alpha[vocaCount - 'A']++;
			}
		}
		int max = 0;
		char maxAlpha = '?';
		for (int i = 0; i < 26; i++) {
			if (alpha[i] > max) {
				max = alpha[i];
				maxAlpha = (char) (65 + i);				
			}else if(alpha[i]==max) {
				maxAlpha = '?';
			}
		}
		System.out.println(maxAlpha);
	}
}