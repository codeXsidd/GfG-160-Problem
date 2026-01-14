class Solution {
    public void sort012(int[] arr) {
        // code here
       int lo=0,mid=0;
       int hi=arr.length-1;
       while(mid<=hi){
           if(arr[mid]==0){
              int temp=arr[lo];
              arr[lo]=arr[mid];
              arr[mid]=temp;
              lo+=1;mid+=1;
           }
           else if(arr[mid]==1)
             mid+=1;
           else{
               int temp=arr[mid];
               arr[mid]=arr[hi];
               arr[hi]=temp;
               hi-=1;
           }
       }
       
    }
}
