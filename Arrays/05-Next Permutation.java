class Solution {
    void nextPermutation(int[] arr) {
        int n=arr.length;
        int pivot=-1;
        
        for(int i=n-2;i>=0;i--){
            if(arr[i]<arr[i+1]){
                pivot=i;
                break;
            }
        }
        if(pivot==-1){
            rev(arr,0,n-1);
            return;
        }
        for(int i=n-1;i>=0;i--){
            if(arr[i]>arr[pivot]){
                swap(arr,i,pivot);
                break;
            }
        }
        
        rev(arr,pivot+1,n-1);
        
    }
        void rev(int arr[],int start,int end){
            while(start<end){
               swap(arr,start++,end--);
            }
        }
        
        void swap(int arr[],int start,int end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
        }
        
        
    
}
