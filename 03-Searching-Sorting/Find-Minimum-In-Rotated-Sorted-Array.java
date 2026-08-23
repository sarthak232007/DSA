
/*Problem Find Minimum in Rotated Sorted Array */
/* This solution is made for leetcode  */

public class Solution {
    
public int findMin(int [] nums) {
    int start = 0, end = nums.length - 1;
    while (start < end) {

        int mid = start + (end - start) / 2;
 
if(nums[mid] > nums[end])   /*check mid with end  */
{

    start = mid + 1;

}else {
 end = mid;
}

    }

    return nums[start];
}



}
