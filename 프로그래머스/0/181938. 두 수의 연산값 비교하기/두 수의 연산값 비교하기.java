class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        
        String ab = String.valueOf(a) + String.valueOf(b);
        answer = Integer.parseInt(ab);
        
        if(answer < 2 * a * b){
            answer = 2 * a * b;
        }
        
        return answer;
    }
}