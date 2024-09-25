class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = "";
        for(int i=0; i<s;i++){
            answer+=my_string.charAt(i);
        }
        answer+=overwrite_string;
        if(overwrite_string.length()+s < my_string.length()){
            int temp = overwrite_string.length()+s;
            for(int j=0;j<my_string.length() - (overwrite_string.length()+s);j++){
                answer+=my_string.charAt(temp);
                temp++;
            }
        }
        return answer;
    }
}