public class Solution {
    public int solve(ArrayList<Integer> A) {
        
if(A.size()==1) return 1;
int n=A.size();

int left[]=new int[n];
int right[]=new int[n];
left[0]=A.get(0);
left[1]=A.get(1);
right[n-1]=A.get(n-1);
right[n-2]=A.get(n-2);
for(int i=2, j=n-3; i<n && j>=0; i++, j--)
{
left[i]=left[i-2]+A.get(i);
right[j]=right[j+2]+A.get(j);
}
int count=0;
for(int i=0; i<n; i++)
{
int left1=((i>0) ? left[i-1] : 0);
int left2=((i>1) ? left[i-2] : 0);
int right1=((i<n-1)? right[i+1] : 0);
int right2=((i<n-2)? right[i+2] : 0);
if(left1+right2 == left2+right1) count++;
}
return count;
}
}
