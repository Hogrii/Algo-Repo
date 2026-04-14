import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        while(n-- > 0) {
            int k = Integer.parseInt(br.readLine());
            int passengers = 0;

            for(int i=0; i<k; i++) {
                passengers = passengers * 2 + 1;
            }

            sb.append(passengers).append("\n");
        }

        System.out.println(sb);
    }
}