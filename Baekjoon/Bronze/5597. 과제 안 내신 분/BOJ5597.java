import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ5597 {
	public static void main(String[] args) throws IOException{
		// 과제 안 내신 분..?
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		int[] studentNum = new int[30];
		int cnt = 0;
		
		for(int i=0; i<studentNum.length; i++) {
			studentNum[i] = 0;
		}
		
		for(int i=0; i<28; i++) {
			st = new StringTokenizer(br.readLine());
			studentNum[Integer.parseInt(st.nextToken())-1] = 1;
		}
		
		for(int i=0; i<studentNum.length; i++) {
			if(studentNum[i] == 0) System.out.println(i+1);
		}
	}
}
