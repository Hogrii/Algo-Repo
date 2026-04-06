import java.util.Scanner;

public class BOJ5622 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int length = str.length()-1;
		int num = 0;
		
		for(int i=0; i<str.length(); i++) {
			String substr = str.substring(i, i+1);
			if(substr.equals("A")||substr.equals("B")||substr.equals("C")){
				num = num + 3;
				length = length - 1;				
			}else if(substr.equals("D")||substr.equals("E")||substr.equals("F")) {
				num = num + 4;
				length = length - 1;
			}else if(substr.equals("G")||substr.equals("H")||substr.equals("I")) {
				num = num + 5;
				length = length - 1;
			}else if(substr.equals("J")||substr.equals("K")||substr.equals("L")) {
				num = num + 6;
				length = length - 1;
			}else if(substr.equals("M")||substr.equals("N")||substr.equals("O")) {
				num = num + 7;
				length = length - 1;
			}else if(substr.equals("P")||substr.equals("Q")||substr.equals("R")||substr.equals("S")) {
				num = num + 8;
				length = length - 1;
			}else if(substr.equals("T")||substr.equals("U")||substr.equals("V")) {
				num = num + 9;
				length = length - 1;
			}else if(substr.equals("W")||substr.equals("X")||substr.equals("Y")||substr.equals("Z")) {
				num = num + 10;
				length = length - 1;
			}
		}
		System.out.println(num);
	}
}