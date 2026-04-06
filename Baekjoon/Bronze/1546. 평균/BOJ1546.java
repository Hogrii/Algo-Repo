import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ1546 {
	public static void main(String[] args) throws IOException {
		// 평균
		
		// 1. 세 성적의 평균을 구한다.
		// 2. 세 성적의 평균을 최고점으로 나누고 100을 곱한다.
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		// 과목의 수
		int N = Integer.parseInt(br.readLine());
		
		// 각 과목의 점수
		int[] score = new int[N];
		
		// 최고점, 총합
		int max = 0;
		double total = 0;
		
		// 점수 입력, 최고점 입력
		st = new StringTokenizer(br.readLine(), " ");
		for(int i=0; i<N; i++) {			
			score[i] = Integer.parseInt(st.nextToken());
			if(score[i] > max) max = score[i];
		}
		
		// 점수 조작하기
		for(int i=0; i<score.length; i++) {
			total += ((double)score[i]/max)*100;
		}
		
		// 세준이식 평균내기
		System.out.println(total/N);
	}
}

/*
// 예전 코드 

Scanner sc = new Scanner(System.in);
int N = sc.nextInt();
int[] score = new int[N];
double total = 0;

for(int i=0; i<score.length; i++) {
	score[i] = sc.nextInt();
}

int max = score[0];
for(int i=1; i<score.length; i++) {
	if(max<score[i]) {
		max = score[i];
	}
}

for(int i=0; i<score.length; i++) {
	total = total + (((double)score[i]/max)*100);
}
System.out.println(total/N);
*/