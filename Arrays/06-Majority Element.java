import java.util.*;
class Solution {
    public List<Integer> findMajority(int[] arr) {
        int n=arr.length;
        int ele1=Integer.MIN_VALUE,ele2=Integer.MIN_VALUE;
        int cnt1=0,cnt2=0;
        for(int num:arr){
            if(ele1==num){
                cnt1++;
            }
            else if(ele2==num){
                cnt2++;
            }
            else if(cnt1==0){
                ele1=num;
                cnt1++;
            }
            else if(cnt2==0){
                ele2=num;
                cnt2++;
            }
            else{
                cnt1--;
                cnt2--;
            }
        }
        List<Integer> res=new ArrayList<>();
        cnt1=cnt2=0;
        for(int num:arr){
            if(ele1==num)cnt1++;
           else if(ele2==num) cnt2++;
        }
        if(cnt1>n/3)res.add(ele1);
        if(cnt2>n/3) res.add(ele2);
        Collections.sort(res);
        return res;
    }
}
