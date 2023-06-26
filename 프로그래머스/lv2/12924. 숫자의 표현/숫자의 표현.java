class Solution {
    public int solution(int n) {
        int answer = 0;
        for (int i = 0; i <= n; i++) {
            int sum = 0;
            int j = i;
            while (sum < n) {
                j = j + 1;
                sum = sum+j;
                if (sum == n) {
                    answer++;
                    break;
            }
        }
        }
        return answer;
    }
}