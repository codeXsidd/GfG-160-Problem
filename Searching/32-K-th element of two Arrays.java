class Solution {
    public int kthElement(int a[], int b[], int k) {
        // code here
        int n=a.length,m=b.length;
        int[] arr = new int[n+m];
        int i=0,j=0,d=0;
        while(i<n && j<m){
            if(a[i]<b[j]){
               arr[d++]=a[i++];}
            else{
              arr[d++]=b[j++];}
        }
        while(i<n){
          arr[d++]=a[i++];
        }
        while(j<m){
           arr[d++]=b[j++];
        }
        return arr[k-1];
    }
}
