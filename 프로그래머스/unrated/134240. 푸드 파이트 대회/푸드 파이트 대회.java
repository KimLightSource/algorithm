class Solution {
     public String solution(int[] food) {
        String answer = "";
        StringBuffer br = new StringBuffer();
        for (int i = 1; i < food.length; i++) {
            for (int j = 0; j < food[i]/2; j++) {
                br.append(i);
            }
        }
        br.append(0);
        for (int i = food.length-1; i > 0; i--) {
            for (int j = 0; j < food[i] /2; j++) {
                br.append(i);
            }
        }
        answer = br.toString();
        return answer;
    }
}