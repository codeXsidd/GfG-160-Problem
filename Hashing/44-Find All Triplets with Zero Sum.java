// User function Template for Java
class Solution {
    public List<List<Integer>> findTriplets(int[] arr) {
        // Your code here
        HashMap<Integer,List<Integer>>map=new HashMap<>();
        List<List<Integer>> ans=new ArrayList<>();
        for(int j=0;j<arr.length;j++){
            for(int k=j+1;k<arr.length;k++){
                int val=-1*(arr[j]+arr[k]);
                if(map.containsKey(val)){
                    for(int i:map.get(val)){
                        ans.add(Arrays.asList(i,j,k));
                    }
                }
            }
        
            map.putIfAbsent(arr[j],new ArrayList<>());
            map.get(arr[j]).add(j);
        }
        return ans;
    }
}
