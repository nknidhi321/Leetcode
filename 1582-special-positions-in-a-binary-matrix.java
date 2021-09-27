//https://leetcode.com/problems/special-positions-in-a-binary-matrix/

class Solution {
    public int numSpecial(int[][] matrix) {
        
        int n = matrix.length;
        int m = matrix[0].length;
        
        int[] rowOnesCount = new int[n];
        //row[0] == 0th row me kitne ones
        //row[1] == 1st row me kitne ones
        //row[2] == 2nd row me kitne ones
        
        int[] colOnesCount = new int[m];
        //col[0] == 0th col me kitne ones
        //col[1] == 1st col me kitne ones
        //col[2] == 2nd col me kitne ones
        
        
        //Counting ones for rowOnesCount and colOnesCount
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                if(matrix[i][j] == 1) {
                    rowOnesCount[i]++;
                    colOnesCount[j]++;
                }        
            }
        }
        
        
        //We will search for those cells which is 1 
        //and it should be the only element in the entire row and entire column
        int count = 0;
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                if(matrix[i][j] == 1 && rowOnesCount[i] == 1 && colOnesCount[j] == 1){
                    count++;
                }        
            }
        }
        
        return count;
    }
}
