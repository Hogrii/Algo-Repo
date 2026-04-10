import java.util.*;
import java.io.*;

public class Main {
    public static int result = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        solve(N, r, c);

        System.out.println(result);
    }

    public static void solve(int N, int r, int c) {
        if(N == 0) return;

        int size = (int)Math.pow(2, N-1);
        int area = size * size;

        if(r < size && c < size) {
            solve(N-1, r, c);
        }
        else if(r < size && c >= size) {
            result += area;
            solve(N-1, r, c - size);
        }
        else if(r >= size && c < size) {
            result += area * 2;
            solve(N-1, r - size, c);
        }
        else if(r >= size && c >= size) {
            result += area * 3;
            solve(N-1, r - size, c - size);
        }
    }
}