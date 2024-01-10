package BACKTRACKING;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String word = in.next();
        boolean[] visited = new boolean[word.length()];

        backtrack("", word, visited);
    }

    private static void backtrack(String curr, String word, boolean[] visited) {
        if(curr.length()==word.length()){
            System.out.println(curr);
            return;
        }
        for(int i=0;i<word.length();i++){
            if(!visited[i]) {
                visited[i]=true;
                backtrack(curr + word.charAt(i), word, visited);
                visited[i]=false;
            }
        }
    }
}
