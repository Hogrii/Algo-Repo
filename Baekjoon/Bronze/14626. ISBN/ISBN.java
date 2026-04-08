import java.util.*;
import java.io.*;

public class Main {
    final private static int ISBN_LENGTH = 13;
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        int weight = 1;
        int targetWeight = 1;
        int sum = 0;
        for(int i=0; i<ISBN_LENGTH; i++) {
            weight = i%2 == 0 ? 1 : 3;
            if(str.charAt(i) != '*') {
                sum += Integer.parseInt(String.valueOf(str.charAt(i))) * weight;
            }
            else {
                targetWeight = weight;
            }
        }

        for(int i=0; i<=9; i++) {
            if((sum + (i * targetWeight)) % 10 == 0) {
                System.out.println(i);
                break;
            }
        }
    }
}