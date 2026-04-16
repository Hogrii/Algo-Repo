import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        boolean[] walls = new boolean[N];
        for(int i=0; i<walls.length; i++) walls[i] = true;

        int act = Integer.parseInt(br.readLine());
        for(int i=0; i<act; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());

            for(int j=start; j<end; j++) {
                walls[j] = false;
            }
        }

        int cnt = 0;
        for(int i=0; i<walls.length; i++) {
            if(walls[i]) cnt++;
        }

        System.out.println(cnt);
    }
}