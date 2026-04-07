import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int last = 0;

        Queue<Integer> q = new LinkedList<>();

        for(int i=0; i<N; i++) {
            st = new StringTokenizer(br.readLine());

            switch(st.nextToken()) {
                case "push":
                    int pushNum = Integer.parseInt(st.nextToken());
                    q.add(pushNum);
                    last = pushNum;
                    break;
                case "pop":
                    if(q.isEmpty()) sb.append("-1").append("\n");
                    else sb.append(q.poll()).append("\n");
                    break;
                case "size":
                    sb.append(q.size()).append("\n");
                    break;
                case "empty":
                    if(q.isEmpty()) sb.append("1").append("\n");
                    else sb.append("0").append("\n");
                    break;
                case "front":
                    if(q.isEmpty()) sb.append("-1").append("\n");
                    else sb.append(q.peek()).append("\n");
                    break;
                case "back":
                    if(q.isEmpty()) sb.append("-1").append("\n");
                    else sb.append(last).append("\n");
                    break;
            }
        }

        System.out.println(sb);
    }
}