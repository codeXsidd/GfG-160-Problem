class Solution {
    static ArrayList<int[]> mergeOverlap(int[][] intervals){
        Arrays.sort(intervals,Comparator.comparingInt(a ->a[0]) );
        ArrayList<int[]>res=new ArrayList<>();
        res.add(intervals[0]);
        for(int i=1;i<intervals.length;i++){
            int[] last=res.get(res.size()-1);
            int[] curr=intervals[i];
            if(curr[0]<=last[1])
                last[1]=Math.max(last[1],curr[1]);
            else
              res.add(curr);
        }
        return res;
    }
    public ArrayList<int[]> insertInterval(int[][] intervals, int[] newInterval) {
        // code here
        ArrayList<int[]> intervalList=new ArrayList<>(Arrays.asList(intervals));
        intervalList.add(newInterval);
        return mergeOverlap(intervalList.toArray(new int[0][] ));
    }
}
