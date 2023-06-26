class Solution {
    public int solution(int n) {
        int answer = 0;
        String s = Integer.toBinaryString(n);
        int countOne = countOne(s);
        n = n + 1;
        while (countOne(Integer.toBinaryString(n)) != countOne) {
            n = n + 1;
        }
        return n;
    }
    
    private int countOne(String s) {
        char[] chars = s.toCharArray();
        int count = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '1') count++;
        }
        return count;
    }
}