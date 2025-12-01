class Solution {
    public int solution(String A, String B) {
        int answer = -1;
        String temp;
        int count = 0;
        int length = A.length();
        
        String[] arr = A.split("");
        
        for(int i=0;i<length;i++) {
        	String str = String.join("", arr);
        	if(str.equals(B)) {
        		answer = count;
        		return answer;
        	}
        	temp = arr[length - 1];
        	for(int j=length - 2;j>=0;j--) {
            	arr[j + 1] = arr[j];
            }
        	arr[0] = temp;
        	count++;
        }
        return answer;
    }
}