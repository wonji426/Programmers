class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int result_mult = 1;
        int result_sum = 0;
        for(int i=0;i<num_list.length;i++){
            result_mult *= num_list[i];
            result_sum += num_list[i];
        }
        if(result_mult < (result_sum*result_sum)){
            answer = 1;
        }else{
            answer = 0;
        }
        
        return answer;
    }
}