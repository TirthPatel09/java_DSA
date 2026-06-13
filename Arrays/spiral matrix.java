class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int top=0;
        int bottum=matrix.length-1;
        int left=0;
        int right=matrix[0].length-1;

        List<Integer> ans=new ArrayList<>();
        while(top<=bottum && left<=right){
            for(int i=left;i<=right;i++){
                ans.add(matrix[top][i]);
            }
            top++;
            for(int i=top;i<=bottum;i++){
                ans.add(matrix[i][right]);
            }
            right--;
            if(top<=bottum){
            for(int i=right;i>=left;i--){
                ans.add(matrix[bottum][i]);
            }
            }
            bottum--;
            if(left<=right){
            for(int i=bottum;i>=top;i--){
                ans.add(matrix[i][left]);
            }
            left++;
        }
      
    }
     return ans;
}
}
