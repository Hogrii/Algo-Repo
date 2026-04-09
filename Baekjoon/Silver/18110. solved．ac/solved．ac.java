import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];

        for(int i=0; i<N; i++) arr[i] = Integer.parseInt(br.readLine());

        Arrays.sort(arr);

        int T = (int) Math.round(N * 0.15);
        int sum = 0;
        for(int i=T; i<N-T; i++) {
            sum += arr[i];
        }

        System.out.println(Math.round((double)sum/(N-2*T)));
    }
}