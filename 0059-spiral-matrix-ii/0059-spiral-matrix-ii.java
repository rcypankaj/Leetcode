class Solution {
    public int[][] generateMatrix(int n) {
        int [][] arr = new int[n][n];
        int firstrow=0, lastrow=n-1;
        int firstcolm= 0, lastcolm =n-1;
        int num=1;

        while(firstrow<=lastrow && firstcolm<=lastcolm ){
            for(int j=firstcolm;j<=lastcolm;j++){
                arr[firstrow][j] = num++;
            }
            firstrow++;
            for(int i=firstrow;i<=lastrow;i++){
                arr[i][lastcolm] = num++;
            } lastcolm--;
            if (firstrow <= lastrow){

            for(int j =lastcolm;j>=firstcolm;j--){
                arr[lastrow][j] = num++;
            }
            lastrow--;
            }

            if (firstrow <= lastrow){

            for(int i=lastrow;i>=firstrow;i--){
                arr[i][firstcolm]=num++;
            }
            firstcolm++;
            }
        }
        return arr;
        
    }
}