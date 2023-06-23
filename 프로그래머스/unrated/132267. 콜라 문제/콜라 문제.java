class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        int count = 0;
        while (n >= a) {
            count = n % a;
            n = n / a;
            answer = answer + (n * b);
            n = (n*b) + count;
        }
        return answer;
    }
}