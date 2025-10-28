package 백준.문자열;

import java.util.Scanner;

// 아스키 코드 0 -48 / A - 65 / a - 97
public class Prac2744_대소문자바꾸기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        // 입력
        String A = sc.nextLine().trim();
        char[] arr = A.toCharArray();

        // 로직
        for (char c : arr) {
            if (c >= 'A' && c <= 'Z') sb.append((char) (c - 'A' + 'a'));
            else sb.append((char) (c - 'a' + 'A'));
        }

        // 출력
        System.out.println(sb);
    }
}

//import java.io.*;
//
//public class Main {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String s = br.readLine();
//        StringBuilder sb = new StringBuilder();
//
//        for (char c : s.toCharArray()) {
//            if (Character.isUpperCase(c)) sb.append(Character.toLowerCase(c));
//            else sb.append(Character.toUpperCase(c));
//        }
//        System.out.println(sb);
//    }
//}
