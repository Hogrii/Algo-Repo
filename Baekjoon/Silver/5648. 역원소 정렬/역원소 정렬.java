import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int N = Integer.parseInt(sc.next());
        long[] arr = new long[N];
        for(int i=0; i<N; i++) {
            String reversedNum = new StringBuilder(sc.next()).reverse().toString();
            arr[i] = Long.parseLong(reversedNum);
        }

        Arrays.sort(arr);
        for(int i=0; i<arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}