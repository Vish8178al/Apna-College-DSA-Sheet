//array - problem:04 - EASY
//Contains Duplicate

import java.util.*;
class arrays_04_E {
    public static boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for(int i=1; i<nums.length; i++){
            if(nums[i]==nums[i-1]){
                return true;
            }
        }
        return false;
    }
    public static void main(String args[]){
        int nums[] = {1,2,3,1};
        System.out.println(containsDuplicate(nums));
    }
}

//For more info visit: https://leetcode.com/problems/contains-duplicate/description/

//If you like my code do give stars:-)
//Keep coding!!
//Thankyou;-)