class Solution {
    public int hIndex(int[] citations) {
        // code here
        int n=citations.length;
        int[] freq=new int[n+1];
        
        for(int i=0;i<n;i++){
            if(citations[i]>=n)
              freq[n]+=1;
            else
              freq[citations[i]]+=1;
        }
        int ind=n;
        int s=freq[n];
        while(s<ind){
            ind--;
            s+=freq[ind];
        }
        return ind;
    }
}
