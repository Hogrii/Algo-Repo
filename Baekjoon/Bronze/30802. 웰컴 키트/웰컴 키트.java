import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        int[] shirts = new int[6];

        st = new StringTokenizer(br.readLine());
        for(int i=0; i<shirts.length; i++) {
            shirts[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        int T = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());

        int tBundle = 0;
        for(int shirt : shirts) tBundle += (shirt + T - 1) / T;

        sb.append(tBundle).append("\n");
        sb.append(N/P).append(" ").append(N%P);

        System.out.println(sb);
    }
}