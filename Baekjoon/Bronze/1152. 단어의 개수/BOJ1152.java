import java.util.Scanner;

public class BOJ1152 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		// 공백제거
		// trim() vs strip() -> trim보다 strip이 더 광범위하게 공백을 제거
		str = str.strip();
		// str의 단어 사이에 공백이 여러개 있을 경우 1개의 공백을 제외하고 제거
		str = str.replaceAll("\\s+", " ");
		String[] array = str.split(" ");
		int count = 0;
		for(int i=0; i<array.length; i++) {
			count++;			
		}		
		// str에 공백 하나만 입력되었을 경우
		if(array.length==1 && array[0]=="") {
			count = 0;
		}
		System.out.println(count);
	}
}