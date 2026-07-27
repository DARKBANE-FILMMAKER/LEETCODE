class Solution {
    public String getHint(String secret, String guess) {
        int bulls = 0;
        int cows = 0;
        
        int[] secretCounts = new int[10];
        int[] guessCounts = new int[10];
        
        for (int i = 0; i < secret.length(); i++) {
            char sChar = secret.charAt(i);
            char gChar = guess.charAt(i);
            
            if (sChar == gChar) {
       
                bulls++;
            } else {
             
                secretCounts[sChar - '0']++;
                guessCounts[gChar - '0']++;
            }
        }
        
  
        for (int d = 0; d < 10; d++) {
            cows += Math.min(secretCounts[d], guessCounts[d]);
        }
        
        return bulls + "A" + cows + "B";
    }
}



























