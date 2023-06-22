class Solution {
      public String solution(int[] food) {
        String answer = "";
        StringBuffer br = new StringBuffer();
        for (int i = 1; i < food.length; i++) {
            for (int j = 0; j < food[i]/2; j++) {
                br.append(i);
            }
        }
        answer = br.toString();
        br.append(0);
        answer = answer + br.reverse().toString();
        return answer;
    }
}