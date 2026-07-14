// Last updated: 14/07/2026, 14:14:08
class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max=0;
        List<Boolean> result=new ArrayList<>();
        int n=candies.length;
        for(int i=0;i<n;i++){
            if(candies[i]>max){
                max=candies[i];
            }
        }
        for(int i=0;i<n;i++){
            if(candies[i]+extraCandies>=max){
                    result.add(true);
            }
             else{
                result.add(false);
            
            }
        }
        return result;
    }
}