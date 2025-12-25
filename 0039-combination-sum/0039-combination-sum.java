class Solution {
    public void findCombinations(int ind, int[] arr, int target, List<List<Integer>> ans, List<Integer> ds){
        if(ind==arr.length){
            if(target==0){
                ans.add(new ArrayList<>(ds));  
            }
            return;
        }
        if(arr[ind]<=target){
            //pick the element in that index
            ds.add(arr[ind]);
            findCombinations(ind,arr,target-arr[ind],ans,ds);
            ds.remove(ds.size()-1);
        }
        //not pick
        findCombinations(ind+1,arr,target,ans,ds);

    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        findCombinations(0,candidates,target,ans,new ArrayList<>());
        return ans;
        
    }
}