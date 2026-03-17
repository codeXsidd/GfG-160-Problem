class Solution {
    public ArrayList<Integer> intersect(int[] a, int[] b) {
        // code here
        HashSet<Integer> sa=new HashSet<>();
        for(int num : a){
            sa.add(num);
        }
        ArrayList<Integer> res=new ArrayList<>();
        for(int num : b){
            if(sa.contains(num)){
                res.add(num);
                sa.remove(num);
            }
        }
        return res;
    }
}
