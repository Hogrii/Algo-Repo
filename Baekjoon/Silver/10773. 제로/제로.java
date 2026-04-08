import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Integer> s = new Stack<>();

        int K = Integer.parseInt(br.readLine());

        while(K-- > 0) {
            int num = Integer.parseInt(br.readLine());

            if(num != 0) s.add(num);
            else s.pop();
        }

        int sum = 0;
        while(!s.isEmpty()) {
            sum += s.pop();
        }
        System.out.println(sum);
    }
}