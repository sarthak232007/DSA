/*We need to return the index of peak element  */

/* peak element is an element that is greater than its neighbour element  */


/* This solution is made for leetcode  */


class Solution{
    public int findPeakElement(int[] nums){

  int start = 0, end = nums.length - 1;

  while (start < end){

int mid = start + (end - start) / 2;

if(nums[mid] < nums[mid + 1]){
    start = mid + 1;
}

else {

    end = mid;
}
  }

return start;


    }



}