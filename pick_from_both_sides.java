public class Solution {
    public int solve(ArrayList<Integer> A, int B) {
        int sum=0;
        for(int i=0;i<B; i++){
            sum=sum+A.get(i);
        }
        int maxsum=sum;
        for(int j=A.size()-1; j>(A.size()-B-1);j--){
            sum=sum+A.get(j)-A.get(j-(A.size()-B));
        
            if(sum>maxsum){
                maxsum=sum;
            }
            
        }
        return maxsum;
    }
}
