import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        Stack<Integer> stack = new Stack<>();
        int N = Integer.parseInt(br.readLine());
        int curNum = 1;
        boolean flag = true;

        for(int i=0; i<N; i++) {
            int target = Integer.parseInt(br.readLine());
            while(true) {
                if(target >= curNum) {
                    stack.push(curNum++);
                    sb.append("+").append("\n");
                }
                else {
                    if(stack.peek() == target) {
                        stack.pop();
                        sb.append("-").append("\n");
                        break;
                    }
                    else {
                        sb.setLength(0);
                        sb.append("NO");
                        flag = false;
                        break;
                    }
                }
            }
            if(!flag) break;
        }

        System.out.println(sb);
    }
}