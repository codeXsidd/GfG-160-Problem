class Solution {
   static boolean search(int[] arr,int x){
       int lo=0,hi=arr.length-1;
       while(lo<=hi){
           int mid=(lo+hi)/2;
           if(x==arr[mid])
             return true;
           if(x<arr[mid])
             hi=mid-1;
           else
             lo=mid+1;
       }
       return false;
   }
    public boolean searchRowMatrix(int[][] mat, int x) {
        int n=mat.length,m=mat[0].length;
        for(int i=0;i<n;i++){
            if(search(mat[i],x))
               return true;
        }
        return false;
    }
}
