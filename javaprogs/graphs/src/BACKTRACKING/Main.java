package BACKTRACKING;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String word = in.next();
        boolean[] visited = new boolean[word.length()];

        backtrack("", word);
    }

    private static void backtrack(String curr, String word) {
        if(curr.length()==word.length()){
            System.out.println(curr);
            return;
        }
        for(int i=0;i<word.length();i++){
            backtrack(curr+word.charAt(i), word);
        }
    }
}
