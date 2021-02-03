public class Solution {
    public int solve(ArrayList<Integer> A) {
    int max=A.get(0);
    int min=A.get(0);
    for(int i=0;i<A.size();i++){
        if (max<A.get(i)){
        max=A.get(i);}
        if(min>A.get(i)){
        min=A.get(i);}
        
    }
    return max+min;
    }
}
