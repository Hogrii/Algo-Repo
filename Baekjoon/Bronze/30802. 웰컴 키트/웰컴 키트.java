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
        for(int i=0; i<shirts.length; i++) {
            if(shirts[i] % T != 0) tBundle += (shirts[i] / T) + 1;
            else tBundle += shirts[i] / T;
        }
        sb.append(tBundle).append("\n");
        sb.append(N/P).append(" ").append(N%P);

        System.out.println(sb);
    }
}