import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int arr[] = new int[Integer.parseInt(br.readLine())];

        for(int i=0; i<arr.length; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        br.close();

        ArrayList<Integer> list = new ArrayList<>();
        Arrays.sort(arr);

        double first = 0;

        // 산술평균
        for(int i=0; i<arr.length; i++) {
            first += arr[i];
        }
        long finalAvg = Math.round(first/arr.length);
        list.add((int)finalAvg);

        // 중앙값
        list.add(arr[arr.length/2]);

        // 최빈값
        Map<Integer, Integer> map = new HashMap<>();
        for(int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        int maxCount = Collections.max(map.values());
        List<Integer> maxList = new ArrayList<>();
        for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if(entry.getValue() == maxCount) {
                maxList.add(entry.getKey());
            }
        }
        Collections.sort(maxList);
        list.add(maxList.size() > 1 ? maxList.get(1) : maxList.get(0));

        // 범위
        list.add(arr[arr.length-1]-arr[0]);

        for(int result : list) {
            sb.append(result).append('\n');
        }
        System.out.println(sb);
    }
}