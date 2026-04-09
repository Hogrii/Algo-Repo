import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str1 = br.readLine();
        String str2 = br.readLine();
        String str3 = br.readLine();

        int nextNum = 0;

        if(Character.isDigit(str1.charAt(0))) nextNum = Integer.parseInt(str1) + 3;
        else if(Character.isDigit(str2.charAt(0))) nextNum = Integer.parseInt(str2) + 2;
        else if(Character.isDigit(str3.charAt(0))) nextNum = Integer.parseInt(str3) + 1;

        String result = "";

        if(nextNum % 15 == 0) result = "FizzBuzz";
        else if(nextNum % 3 == 0) result = "Fizz";
        else if(nextNum % 5 == 0) result = "Buzz";
        else result = String.valueOf(nextNum);

        System.out.println(result);
    }
}