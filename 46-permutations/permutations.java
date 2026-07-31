class Solution {
    List<List<Integer>> res=new ArrayList<>();

    public List<List<Integer>> permute(int[] nums)
    {List<Integer> list=new ArrayList<>();
        backtrack(nums,list);
        return res;
    }

     public void backtrack(int[] nums,List<Integer> list)
    {
        if(list.size()==nums.length)
        {
            res.add(new ArrayList<>(list));
            return;
        }
        for(int i=0;i<nums.length;i++)
        {
            if(list.contains(nums[i]))
            continue;
            list.add(nums[i]);
            backtrack(nums,list);
            list.remove(list.size()-1);
        }
    }
}     



  