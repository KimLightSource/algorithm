import java.sql.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Main main = new Main();
        Scanner in=new Scanner(System.in);
        String word = in.next();
        System.out.println(main.solution(word));
    }

    public int solution(String word) {
        int answer = 0;
        StringBuilder sb = new StringBuilder(word);
        String s = sb.reverse().toString();
        if (word.equals(s)) {
            answer = 1;
        }
        return answer;
    }
}