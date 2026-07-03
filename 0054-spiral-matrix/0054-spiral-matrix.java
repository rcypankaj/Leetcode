class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int n = matrix.length, m = matrix[0].length;

        List<Integer> res = new ArrayList<>();

        int top = 0, bottom = n-1, left = 0, right = m-1, jump = 0;

        while (top <= bottom && left <= right) {
            switch (jump) {
                case 0: 
                    for (int i = left; i <= right; i++) {
                        res.add(matrix[top][i]);
                    }
                    top++;
                    break;
                
                case 1:
                    for (int i = top; i <= bottom; i++) {
                        res.add(matrix[i][right]);
                    }
                    right--;
                    break;

                case 2:
                    for (int i = right; i >= left; i--) {
                        res.add(matrix[bottom][i]);
                    }
                    bottom--;
                    break;

                case 3:
                    for (int i = bottom; i >= top; i--) {
                        res.add(matrix[i][left]);
                    }
                    left++;
            }

            jump = (jump+1)%4;
        }

        return res;

    }
}