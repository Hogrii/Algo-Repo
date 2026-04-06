import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ3003 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		int[] chessPiece = new int[] {1,1,2,2,2,8};
		int[] ownPiece = new int[6];
		st = new StringTokenizer(br.readLine(), " ");
		
		for(int i=0; i<6; i++) {
			ownPiece[i] = Integer.parseInt(st.nextToken());
		}
		
		for(int i=0; i<6; i++) {
			int result = chessPiece[i] - ownPiece[i];
			System.out.print(result + " ");
		}
	}
}
