import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        int X = Integer.parseInt(br.readLine());
        int sum = 0;

        for(int i=0; i<N; i++) {
            st = new StringTokenizer(br.readLine());
            int P1 = Integer.parseInt(st.nextToken());
            int P2 = Integer.parseInt(st.nextToken());

            if(Math.abs(P1-P2) <= X) sum += Math.max(P1, P2);
            else sum += Integer.parseInt(br.readLine());
        }

        System.out.println(sum);
    }
}