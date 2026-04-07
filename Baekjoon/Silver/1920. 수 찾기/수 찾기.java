import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        int[] arr1 = new int[N];
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++) arr1[i] = Integer.parseInt(st.nextToken());

        Arrays.sort(arr1);

        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        StringBuilder sb = new StringBuilder();
        for(int i=0; i<M; i++) {
            int target = Integer.parseInt(st.nextToken());

            if(isExist(arr1, target)) {
                sb.append("1").append("\n");
            }
            else {
                sb.append("0").append("\n");
            }
        }

        System.out.println(sb);
    }

    public static boolean isExist(int[] arr1, int target) {
        int left = 0;
        int right = arr1.length - 1;

        while(left <= right) {
            int mid = (left + right) / 2;

            if(target < arr1[mid]) right = mid - 1;
            else if(target > arr1[mid]) left = mid + 1;
            else {
                return true;
            }
        }
        return false;
    }
}