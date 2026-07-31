class Solution 
{
    List<List<Integer>> res=new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums)
    {
        backtrack(nums,new ArrayList<>(),0);
    return res;
    }
    public void backtrack(int[] nums,List<Integer> list,int s)
    {
        res.add(new ArrayList<>(list));
        for(int i=s;i<nums.length;i++)
        {
            list.add(nums[i]);
            backtrack(nums,list,i+1);
            list.remove(list.size()-1);
        }
    }
}
    
