package com.vandao.easy.van001;

import java.util.Arrays;
import java.util.HashMap;

/**
 * Created by Wangmingwei on 2018/6/12.
 *
 * @ Author Wangmingwei
 * @ Date 2018/6/12
 * @ Version 2.2
 * @ Description
 * @ Copyright <b>火星盒子 版权所有©️2017 ️，www.rabbit.com<br>
 */
public class Solution {
    //O(n2)
    public int[] twoSum1(int[] nums ,int target){
        for(int i=0;i<nums.length;i++){
            for(int j=i;j<nums.length;j++){
                if(nums[i]+nums[j] == target)
                    return new int[]{nums[i],nums[j]};
            }
        }
        return null;
    }

    //O(n)
    public int[] twoSum2(int[] nums,int target){
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<nums.length;i++){
            //使用数组值作为key，target-数组值作为value
            if(map.containsKey(nums[i])){
                return new int[]{map.get(nums[i]),nums[i]};
            }
            map.put(target-nums[i],nums[i]);
        }
        return null;
    }

    public static void main(String[] args){
        Solution solution = new Solution();

        int[] nums = {2,5,8,1,3,0,9};
        int[] result=solution.twoSum2(nums,9);

        //使用Arrays.toString()打印数组。
        System.out.println(Arrays.toString(result));
    }
}
