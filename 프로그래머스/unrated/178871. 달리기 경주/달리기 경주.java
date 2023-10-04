import java.util.*;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        
        Map<String, Integer> rankMap = new HashMap<>();
        
        for(int i = 0; i<players.length; i++) {
            rankMap.put(players[i], i);
        }
        
        
        for(String callPlayer : callings) {
            int rank = rankMap.get(callPlayer);
            
            String frontPlayer = players[rank - 1];
            
            players[rank-1] = callPlayer;
            players[rank] = frontPlayer;
            
            rankMap.put(callPlayer, rank-1);
            rankMap.put(frontPlayer, rank);
        }
        
        return players;
    }
}