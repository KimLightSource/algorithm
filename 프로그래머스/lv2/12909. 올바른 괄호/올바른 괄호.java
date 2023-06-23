class Solution {
    boolean solution(String s) {
        boolean answer = true;
        char[] chars = s.toCharArray();
        int count = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '(') count++;
            else count--;
            if (count < 0) {
                answer = false;
                break;
            }
        }
        if (count != 0) answer = false;
        return answer;
    }
}