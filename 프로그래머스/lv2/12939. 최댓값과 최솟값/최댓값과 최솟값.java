class Solution {
     public String solution(String s) {
        String answer = "";
        String[] s1 = s.split(" ");
        int min = Integer.parseInt(s1[0]);
        int max = Integer.parseInt(s1[0]);
        for(int i=0; i<s1.length-1; i++) {
            min = Math.min(min, Integer.parseInt(s1[i + 1]));
            max = Math.max(max, Integer.parseInt(s1[i + 1]));
        }
        answer = min + " "+ max;
        return answer;
    }

}