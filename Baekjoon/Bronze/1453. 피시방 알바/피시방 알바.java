import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        boolean[] seats = new boolean[101];
        int rejectedCnt = 0;

        for(int i=0; i<N; i++) {
            int seat = Integer.parseInt(st.nextToken());

            if(seats[seat]) rejectedCnt++;
            else seats[seat] = true;
        }

        System.out.println(rejectedCnt);
    }
}