import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ2869 {
	public static void main(String[] args) throws IOException{
		
		/*
		Scanner sc = new Scanner(System.in);
		int afternoon = sc.nextInt();
		int night = sc.nextInt();
		int height = sc.nextInt();
		int day = (height-night)/(afternoon-night);
		
		if((height-night)%(afternoon-night) != 0) {
			day++;
		}
		System.out.println(day);
		*/
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int afternoon = Integer.parseInt(st.nextToken());
		int night = Integer.parseInt(st.nextToken());
		int height = Integer.parseInt(st.nextToken());
		
		int day = (height-night)/(afternoon-night);
		if((height-night)%(afternoon-night)!=0) {
			day++;
		}
		System.out.println(day);
	}
}