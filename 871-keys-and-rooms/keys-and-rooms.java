import java.util.*;

class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int n = rooms.size();
        boolean[] visited = new boolean[n];
        Queue<Integer> queue = new LinkedList<>();

        visited[0] = true;
        queue.add(0);
        int visitedCount = 1;

        while (!queue.isEmpty()) {
            int current = queue.poll();
            for (int key : rooms.get(current)) {
                if (!visited[key]) {
                    visited[key] = true;
                    queue.add(key);
                    visitedCount++;
                }
            }
        }

        return visitedCount == n;
    }
}



