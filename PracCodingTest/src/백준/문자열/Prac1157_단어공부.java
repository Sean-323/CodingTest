package 백준.문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Prac1157_단어공부 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 입력
        String A = br.readLine().trim().toLowerCase();
        int[] countA = new int[26];

        // 로직
        for (char c : A.toCharArray()) countA[c - 'a']++;
        int maxCount = -1;
        char maxAlphabet = '?';

        for (int i = 0; i < 26; i++) {
            if (countA[i] > maxCount) {
                maxCount = countA[i];
                maxAlphabet = (char) ('A' + i);
            } else if (countA[i] == maxCount) maxAlphabet = '?';
        }

        // 출력
        System.out.println(maxAlphabet);
    }
}
