import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        int num = 0;
        
        Queue<Integer> queue = new LinkedList<>();
        
        for(int a : prices) {
            queue.offer(a);
        }
        
        while(!queue.isEmpty()) {
            int firstNum = queue.poll();
            
            for(int i = (prices.length - queue.size()); i < prices.length; i++) {
                if(firstNum > prices[i]) {
                    answer[num]++;
                    break;
                } else {
                    answer[num]++;
                }
            }
            
            num++;
        }
        
        return answer;
    }
}