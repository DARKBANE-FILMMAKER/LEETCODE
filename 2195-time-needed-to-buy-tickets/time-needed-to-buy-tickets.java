class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int totalTime = 0;
        int ticketsK = tickets[k];
        
        for (int i = 0; i < tickets.length; i++) {
            if (i <= k) {
               
                totalTime += Math.min(tickets[i], ticketsK);
            } else {
                
                totalTime += Math.min(tickets[i], ticketsK - 1);
            }
        }
        
        return totalTime;
    }
}