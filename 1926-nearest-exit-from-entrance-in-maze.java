//https://leetcode.com/problems/nearest-exit-from-entrance-in-maze/

class Solution {
    public int nearestExit(char[][] grid, int[] entrance) {
        int n = grid.length, m = grid[0].length;
        int startX = entrance[0], startY = entrance[1];
        int[][] dir = {{-1, 0}, {0, 1}, {1, 0}, {0, -1}};
        
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(startX * m + startY);
        grid[startX][startY] = '+';
        
        int level = 0;
        while(!queue.isEmpty()) {
            int size = queue.size();
            while(size-- > 0) {
                int idx = queue.poll();
                int r = idx / m;
                int c = idx % m;
                
                for(int d = 0; d < dir.length; d++){
                    int x = r + dir[d][0];
                    int y = c + dir[d][1];
                    
                    if(x >= 0 && x < n && y >= 0 && y < m && grid[x][y] == '.'){
                        if(x == 0 || x == n - 1 || y == 0 || y == m - 1) return level + 1;
                        queue.offer(x * m + y);
                        grid[x][y] = '+';
                    }
                }
            }
            level++;
        }
        return -1;
    }
}
