class Solution {
    public String[] solution(String[] players, String[] callings) {
        //TODO for문은 타임아웃. HashMap으로 변경 해야함
        
        for(String call : callings) {
            for(int i = 0; i < players.length; i++) {
                String player = players[i];
                
                if(player.equals(call)) {
                    players[i] = players[i - 1];
                    players[i - 1] = player;
                }
            }
        }
        
        return players;
    }
}
