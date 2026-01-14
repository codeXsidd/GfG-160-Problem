class Solution {
    static final int MAX_CHAR=26;
    static char nonRepeatingChar(String s) {
        // code here
        int[] vis =new int[MAX_CHAR];
        Arrays.fill(vis,-1);
        for(int i=0;i<s.length();i++){
            int ind=s.charAt(i)-'a';
            if(vis[ind]==-1)
                 vis[ind]=i;
                 
            else
               vis[ind]=-2;
        }
        int idx=-1;
        
        for(int i=0;i<MAX_CHAR;i++){
            if(vis[i]>=0 && (idx==-1 || vis[i]<vis[idx])){
                idx=i;
            }
        }
        return (idx==-1) ? '$':s.charAt(vis[idx]);
        
    }
}
