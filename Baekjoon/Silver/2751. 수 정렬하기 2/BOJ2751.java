import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class BOJ2751 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		// 수의 개수
		int N = sc.nextInt();
		
		// Collection.sort를 사용하기 위해 ArrayList 선언
		ArrayList<Integer> list = new ArrayList<>();
		
		// 정렬할 숫자들
		for(int i=0; i<N; i++) {
			list.add(sc.nextInt());
		}
		
		// Collections.sort는 TimSort이다. -> TimSort는 합병 / 삽입정렬 알고리즘을 사용 
		// Collections.sort는 ArrayList를 사용해야 한다.
		Collections.sort(list);
		
		// 출력
		for(int result : list) {
			sb.append(result).append('\n');
		}
		System.out.println(sb);
	}
}
