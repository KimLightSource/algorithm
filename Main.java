import java.sql.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Main main = new Main();
        Scanner in=new Scanner(System.in);
        int n = in.nextInt();
        String[] str = new String[n];
        for(int i=0; i<n; i++) {
            str[i] = in.next();
        }
        for (String x : main.solution(n, str)) {
            System.out.println(x);
        }
        return ;
    }

    public ArrayList<String> solution(int n, String[] str) {
        ArrayList<String> answer = new ArrayList<>();
        for (String x : str) {
            char[] s=x.toCharArray();
            int lt=0, rt=x.length()-1;
            while (lt < rt) {
                char tmp=s[lt];
                s[lt]=s[rt];
                s[rt]=tmp;
                lt++;
                rt--;
            }
            String tmp = String.valueOf(s);
            answer.add(tmp);
        }
        return answer;
    }
}