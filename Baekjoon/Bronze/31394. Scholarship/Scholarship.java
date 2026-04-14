import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int sum = 0;
        boolean hasThree = false;

        for(int i=0; i<n; i++) {
            int point = Integer.parseInt(br.readLine());
            if(point == 3) hasThree = true;
            sum += point;
        }

        if(hasThree) {
            System.out.println("None");
            return;
        }

        double avg = (double)sum / n;

        if(avg == 5.0) System.out.println("Named");
        else if(avg >= 4.5) System.out.println("High");
        else System.out.println("Common");
    }
}