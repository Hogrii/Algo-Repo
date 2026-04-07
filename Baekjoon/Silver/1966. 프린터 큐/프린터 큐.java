import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int T = Integer.parseInt(br.readLine());

        while(T-- > 0) {
            st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());

            Queue<int[]> q = new LinkedList<>();
            st = new StringTokenizer(br.readLine());
            for(int i=0; i<N; i++) {
                int[] qContent = new int[2];
                qContent[0] = i;
                qContent[1] = Integer.parseInt(st.nextToken());
                q.add(qContent);
            }

            int count = 0;

            while(!q.isEmpty()) {
                int[] cur = q.poll();

                boolean isTop = true;
                for(int[] next : q) {
                    if(cur[1] < next[1]) {
                        isTop = false;
                        break;
                    }
                }

                if(isTop) {
                    count++;
                    if(cur[0] == M) {
                        System.out.println(count);
                        break;
                    }
                }
                else {
                    q.add(cur);
                }
            }
        }
    }
}