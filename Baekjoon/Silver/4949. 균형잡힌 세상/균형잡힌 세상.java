import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);

        while(true) {
            boolean result = true;
            Stack<Character> s = new Stack<>();
            String phrase = sc.nextLine();

            if(phrase.equals(".")) break;

            for(int i=0; i<phrase.length(); i++) {
                char letter = phrase.charAt(i);
                switch(letter) {
                    case '(':
                    case '[':
                        s.add(letter);
                        break;
                    case ')':
                        if(s.isEmpty() || s.peek().equals('[')) {
                            result = false;
                            break;
                        }
                        if(s.peek().equals('(')) s.pop();
                        break;
                    case ']':
                        if(s.isEmpty() || s.peek().equals('(')) {
                            result = false;
                            break;
                        }
                        if(s.peek().equals('[')) s.pop();
                        break;
                    case '.':
                        if(!s.isEmpty()) result = false;
                        break;
                }
                if(!result) break;
            }
            if(result) System.out.println("yes");
            else System.out.println("no");
        }
    }
}