public class Solution {
    public ArrayList<Integer> getRow(int A) {
    
        ArrayList<ArrayList <Integer>>res=new ArrayList<ArrayList<Integer>>();
        for(int i=0; i<=A; i++)
        {
        ArrayList<Integer>temp=new ArrayList<Integer>();
        for(int j=0; j<=i; j++){
            if(j==i||j==0)
            {
                temp.add(1);
            }
            else{
                temp.add(res.get(i-1).get(j)+res.get(i-1).get(j-1));
            }}
            res.add(temp);
        
        }
       return res.get(A);
    }
}
