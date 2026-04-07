import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        // 1. 사람들을 리스트에 담아 (인덱스 0부터 N-1까지)
        List<Integer> list = new LinkedList<>();
        for (int i = 1; i <= N; i++) list.add(i);

        StringBuilder sb = new StringBuilder().append("<");
        int index = 0; // 시작 위치

        // 2. 리스트가 빌 때까지 반복
        while (!list.isEmpty()) {
            // 다음에 제거할 사람의 인덱스 계산!
            index = (index + (K - 1)) % list.size();

            // 리스트에서 해당 인덱스 사람 제거
            int removed = list.remove(index);

            if (list.isEmpty()) sb.append(removed).append(">");
            else sb.append(removed).append(", ");
        }

        System.out.println(sb);
    }
}