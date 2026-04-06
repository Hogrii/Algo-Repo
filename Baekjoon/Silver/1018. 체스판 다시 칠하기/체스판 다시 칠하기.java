import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        String[] chessBoard = new String[N];

        for(int i=0; i<N; i++) {
            chessBoard[i] = br.readLine();
        }

        int minCount = 64;
        for(int i=0; i<=N-8; i++) {
            for(int j=0; j<=M-8; j++) {
                int curCount = solve(i, j, chessBoard);

                if(curCount < minCount) {
                    minCount = curCount;
                }
            }
        }
        System.out.println(minCount);
    }

    public static int solve(int startN, int startM, String[] board) {
        int count = 0;

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                char color = board[startN + i].charAt(startM + j);

                boolean isWhite = (i + j) % 2 == 0;
                if (isWhite && color != 'W') count++;
                else if (!isWhite && color != 'B') count++;
            }
        }

        return Math.min(count, 64 - count);
    }
}