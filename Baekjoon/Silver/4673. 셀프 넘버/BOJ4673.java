public class BOJ4673 {	
	// 셀프넘버 메소드
	public static int d(int i) {
		int sum = i;
		while(i != 0) {
			sum = sum + (i%10);
			i = i/10;
		}		
		return sum;
	}
	
	public static void main(String[] args) {		
		// 셀프넘버가 아닌 값들을 담아줄 배열 생성
		boolean[] nonSelfNumber = new boolean[10001];
		
		// 양의 정수 입력
		for(int i=1; i<10001; i++) {
			// Kaprekar의 함수
			int nsn = d(i);
			// 생성자를 갖고있는 값
			if(nsn<10001) {
				// 셀프넘버가 아닌 값들을 true로 설정
				nonSelfNumber[nsn] = true;
			}
		}
		// 문자열을 조립시켜주는 메소드
		StringBuilder sb = new StringBuilder();
		
		for(int i=1; i<10001; i++) {
			// 셀프넘버
			if(!nonSelfNumber[i]) {
				// 셀프넘버 출력 후 개행
				sb.append(i).append('\n');
			}
		}
		System.out.println(sb);		
	}	
}