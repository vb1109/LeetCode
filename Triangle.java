class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int n = triangle.size();
        int a[]=new int[n+1];
        for(int i=n-1;i>=0;i--)
            for(int j=0;j<triangle.get(i).size();j++)
                 a[j]=Math.min(a[j],a[j+1])+triangle.get(i).get(j);
        return a[0];
    }
}
