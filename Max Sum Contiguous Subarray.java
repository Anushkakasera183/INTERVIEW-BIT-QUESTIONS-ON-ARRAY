public class Solution {
   
    public int maxSubArray(final List<Integer> A) {
        int maxsum=A.get(0);
        int maxsofar=A.get(0);
        int n=A.size();
        for(int i=1; i<n; i++){
            if(maxsofar+A.get(i)<A.get(i)){
                maxsofar=A.get(i);
            }
            else{
                maxsofar=A.get(i)+maxsofar;
            }
            if(maxsum<maxsofar){
                maxsum=maxsofar;
            }
        }
        return maxsum;
    }
}
