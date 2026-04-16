import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int K = Integer.parseInt(br.readLine());

        for(int i=1; i<=K; i++) {
            int n = Integer.parseInt(br.readLine());

            ArrayList<Integer> charges = new ArrayList<>();
            for(int j=0; j<n-1; j++) charges.add(Integer.parseInt(br.readLine()));

            ArrayList<String> stations = new ArrayList<>();
            for(int j=0; j<n; j++) stations.add(br.readLine());

            String start = br.readLine();
            String end = br.readLine();

            int startSt = stations.indexOf(start);
            int endSt = stations.indexOf(end);

            int disSt = Math.abs(startSt - endSt);

            System.out.println("Data Set " + (i) + ":");
            System.out.println(charges.get(disSt-1));
            System.out.println();
        }
    }
}