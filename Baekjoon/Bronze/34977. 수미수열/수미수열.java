import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++) arr[i] = Integer.parseInt(st.nextToken());

        boolean isSumi = false;
        for(int i=1; i<=N/2; i++) {
            boolean match = true;
            for(int j=0; j<i; j++) {
                if(arr[j] != arr[N - i + j]) {
                    match = false;
                    break;
                }
            }

            if(match) {
                isSumi = true;
                break;
            }
        }

        System.out.println(isSumi ? "yes" : "no");
    }
}