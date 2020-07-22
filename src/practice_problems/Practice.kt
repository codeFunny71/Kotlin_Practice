package practice_problems

/**
 *  @author Marcus Absher
 *
 *  practice problems from leetcode
 *
 */

fun main() {

    val integers = intArrayOf(1, 2, 3, 4)
    val result = runningSum(integers)
    result.forEach { println(it) }


}

// Given an array nums.
// We define a running sum of an array as
// runningSum[i] = sum(nums[0]…nums[i]).
//
// Return the running sum of nums.

fun runningSum(nums: IntArray): IntArray {
    val result = IntArray(nums.size)
    result[0] = nums[0]
    for (i in 1 until nums.size) {
        result[i] = nums[i] + result[i - 1]
    }
    return result
}