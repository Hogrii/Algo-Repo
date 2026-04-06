import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ2981 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 종이에 적은 숫자의 개수
		int N = Integer.parseInt(br.readLine());
		int paperInNum[] = new int[N];
		
		// 종이에 적은 숫자들
		for(int i=0; i<N; i++) {
			paperInNum[i] = Integer.parseInt(br.readLine());
		}
		
		// 정렬
		Arrays.sort(paperInNum);
		
		// 각 숫자들 차들의 공약수가 M이기 때문에 차를 구한다.
		// 각 숫자들의 차가 음수가 되지 않게 정렬 후 빼주는 것
		int gcfVal = paperInNum[1] - paperInNum[0];
		
		// 최대공약수 찾기
		for(int i=2; i<N; i++) {
			// 바로 앞 최대공약수와 다음의 최대공약수 갱신
			gcfVal = gcf(gcfVal, paperInNum[i] - paperInNum[i-1]);
		}
		
		// 최대공약수의 약수 찾기 및 출력
		for(int i=2; i<=gcfVal; i++) {
			if(gcfVal%i == 0) {
				System.out.print(i + " ");
			}
		}
	}
	
	// 최대공약수 메소드
	public static int gcf(int a, int b) {		
		while(b != 0) {
			int r = a%b;
			a = b;
			b = r;
		}
		return a;
	}
}

//fir : for(int i=2; i<=paperInNum[N-1]; i++) { // 1 2 7
//	for(int j=1; j<paperInNum.length; j++) {
//		if(paperInNum[j-1]%i != paperInNum[j]%i) {
//			continue fir;
//		}
//		if(j == paperInNum.length-1) {
//			sb.append(i).append(" ");					
//		}
//	}			
//}		
//System.out.println(sb);
