package 백준.문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Prac1919_에너그램만들기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 입력
        String A = br.readLine().trim();
        String B = br.readLine().trim();

        // 로직
        int[] countA = getAlphabetCount(A);
        int[] countB = getAlphabetCount(B);
        int result = 0;

        for (int i = 0; i < 26; i++) result += Math.abs(countA[i] - countB[i]);

        // 출력
        System.out.println(result);
    }

    public static int[] getAlphabetCount(String str) {
        int[] count = new int[26];
        for (int i = 0; i < str.length(); i++) count[str.charAt(i) - 'a']++;
        return count;
    }
}


//import java.io.*;
//
//public class Main {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String A = br.readLine();
//        String B = br.readLine();
//
//        int[] count = new int[26];
//        for (char c : A.toCharArray()) count[c - 'a']++;
//        for (char c : B.toCharArray()) count[c - 'a']--;
//
//        int result = 0;
//        for (int diff : count) result += Math.abs(diff);
//
//        System.out.println(result);
//    }
//}
