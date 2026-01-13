class Solution {
    public int missingNumber(int[] arr) {
        // code here
        int n=arr.length;
        for(int i=0;i<n;i++){
            while(arr[i]>=1 && arr[i]<=n && arr[i]!=arr[arr[i]-1]){
                int temp=arr[i];
                arr[i]=arr[arr[i]-1];
                arr[temp-1]=temp;
            }
        }
        for(int i=1;i<=n;i++){
            if(i !=arr[i-1]){
                return i;
            }
        }
        return n+1;
    }
}
