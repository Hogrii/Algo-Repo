import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String uniqNum = br.readLine();

        StringTokenizer st = new StringTokenizer(uniqNum);

        int verifyNum = 0;
        for(int i=0; i<5; i++) {
            int num = Integer.parseInt(st.nextToken());
            verifyNum += num * num;
        }
        System.out.println(verifyNum%10);
    }
}