class Solution {
    public int minRemoval(int intervals[][]) {
        // code here
        int cnt=0;
        Arrays.sort(intervals,(a,b)-> a[0] -b[0]);
        int end=intervals[0][1];
        for(int i=1;i<intervals.length;i++){
            if(intervals[i][0]<end){
                cnt++;
                end=Math.min(intervals[i][1],end);
            }
            else
              end=intervals[i][1];
        }
        return cnt;
    }
}
