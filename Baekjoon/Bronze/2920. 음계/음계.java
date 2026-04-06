import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int first = Integer.parseInt(st.nextToken());

        String result = "";

        if(first == 1) result = "ascending";
        else if(first == 8) result = "descending";
        else result = "mixed";

        if(!result.equals("mixed")) {
            for(int i=0; i<7; i++) {
                int scale = Integer.parseInt(st.nextToken());

                if(result.equals("ascending") && scale != first + 1) {
                    result = "mixed";
                    break;
                }
                if(result.equals("descending") && scale != first - 1) {
                    result = "mixed";
                    break;
                }

                first = scale;
            }
        }

        System.out.println(result);
    }
}