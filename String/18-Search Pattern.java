class Solution {
    ArrayList<Integer> search(String pat, String txt) {
        int m=pat.length(),n=txt.length();
        int[] lps=new int[m];
        ArrayList<Integer> res = new ArrayList<>();
        construct(pat,lps);
        int i=0,j=0;
        while(i<n){
            if(txt.charAt(i)==pat.charAt(j)){
                i++;
                j++;   }
            if(j==m){
                res.add(i-j);
                j=lps[j-1];
            }   
            else if(i<n && pat.charAt(j) != txt.charAt(i)){
                    if(j!=0)
                       j=lps[j-1];
                    else
                      i++;
                }
            } return res;
    }
     void construct(String pat,int[] lps){
        int len=0,i=1;
        lps[0]=0;
        while(i<pat.length()){
            if(pat.charAt(i)==pat.charAt(len)){
                lps[i++]=++len;
            }
            else if(len!=0)
                 len=lps[len-1];
            else
                lps[i++]=0;
            }
        }
}
