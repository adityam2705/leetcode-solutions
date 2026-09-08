class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int start=0;
       int mid=0;
        int n =matrix.length;
        int m=matrix[0].length;
        int end=m*n-1;
        int column =0;
         int row=0;
     while(start<=end){
            mid=start+(end-start)/2;
            row=mid/m;
            column=mid%m;
             if(target==matrix[row][column]){
                return true;
            }
            if(target>matrix[row][column]){
                start=mid+1;
            }
            if(target<matrix[row][column]){
                end=mid-1;
            }   } 

        return false;}
}