import java.util.*;

class Solution {
    public int solution(String message, int[][] spoiler_ranges) {
        int answer = 0;
        
        boolean[] isSpoilerPos = new boolean[message.length()];
        for (int[] range : spoiler_ranges) {
            for (int i = range[0]; i <= range[1]; i++) {
                isSpoilerPos[i] = true;
            }
        }
        
        List<Word> allWords = new ArrayList<>();
        String[] splitWords = message.split(" ");
        int currentPos = 0;

        for (String s : splitWords) {
            int start = message.indexOf(s, currentPos);
            int end = start + s.length() - 1;
            allWords.add(new Word(s, start, end));

            currentPos = end + 1;
        }
        
        Set<String> plainSet = new HashSet<>();
        List<Word> spoilerWords = new ArrayList<>();

        for (Word w : allWords) {
            boolean hasSpoiler = false;
            for (int i = w.start; i <= w.end; i++) {
                if (isSpoilerPos[i]) {
                    hasSpoiler = true;
                    break;
                }
            }

            if (hasSpoiler) {
                spoilerWords.add(w);
            } else {
                plainSet.add(w.text);
            }
        }
        
        Set<String> importantSet = new HashSet<>();
        for (Word sw : spoilerWords) {
            if (!plainSet.contains(sw.text) && !importantSet.contains(sw.text)) {
                answer++;
                importantSet.add(sw.text);
            }
        }
        return answer;
    }
}

class Word {
    String text;
    int start;
    int end;
    
    Word(String text, int start, int end) {
        this.text = text;
        this.start = start;
        this.end = end;
    }
}