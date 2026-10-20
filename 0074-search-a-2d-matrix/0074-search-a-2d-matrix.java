class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        boolean found=false;
        int rows=matrix.length;
        int cols=matrix[0].length;
        int total=rows*cols;
        int low=0;
        int high=total-1;
        while(low<=high){
            int middle=low + (high-low)/2;
            int row2=middle/cols;
            int col2=middle%cols;
            if(matrix[row2][col2]==target){
                found=true;
                break;
            }
            else if(matrix[row2][col2]<target){
                low=middle+1;
            }
            else{
                high=middle-1;
            }
        }
        return found;
    }
}