import java.util.*;
import java.io.*;

public class Main {
    final private static int HASH_VALUE = 31;
    final private static long M = 1234567891;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int L = Integer.parseInt(br.readLine());
        String str = br.readLine();

        long sum = 0;
        for(int i=0; i<L; i++) {
            int alphabet = str.charAt(i) - '`';
            sum += (alphabet * Math.pow(HASH_VALUE, i)) % M;
        }

        System.out.println(sum);
    }
}