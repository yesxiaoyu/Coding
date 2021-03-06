package com.company;

import java.util.Arrays;

// 3. 剧情触发时间
// 在战略游戏中，玩家往往需要发展自己的势力来触发各种新的剧情。
// 一个势力的主要属性有三种，分别是文明等级（C），资源储备（R）以及人口数量（H）。在游戏开始时（第 0 天），三种属性的值均为 0。
//
// 随着游戏进程的进行，每一天玩家的三种属性都会对应增加，我们用一个二维数组 increase 来表示每天的增加情况。
// 这个二维数组的每个元素是一个长度为 3 的一维数组，例如 [[1,2,1],[3,4,2]] 表示第一天三种属性分别增加 1,2,1
// 而第二天分别增加 3,4,2。
//
// 所有剧情的触发条件也用一个二维数组 requirements 表示。
// 这个二维数组的每个元素是一个长度为 3 的一维数组，对于某个剧情的触发条件 c[i], r[i], h[i]，
// 如果当前 C >= c[i] 且 R >= r[i] 且 H >= h[i] ，则剧情会被触发。
//
// 根据所给信息，请计算每个剧情的触发时间，并以一个数组返回。如果某个剧情不会被触发，则该剧情对应的触发时间为 -1 。
class Solution {
    public int[] getTriggerTime(int[][] increase, int[][] requirements) {
        int[] res = {};

        return res;
    }
    void printArray(int[] array) {
        for (int a : array)
            System.out.println(a);
    }
}

public class Main {

    public static void main(String[] args) {
        int[][] increase = {{2,8,4},{2,5,0},{10,9,8}};
        int[][] requirements = {{2,11,3},{15,10,7},{9,17,12},{8,1,14}};
        Solution s = new Solution();
        int[] res = s.getTriggerTime(increase, requirements);
        s.printArray(res); // [2,-1,3,-1]

    }
}
