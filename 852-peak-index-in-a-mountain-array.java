https://leetcode.com/problems/peak-index-in-a-mountain-array/

//TC : O(logN)

class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int left = 0, right = arr.length - 1;
        while(left <= right) {
            int mid = left + (right - left) / 2;
            
            //Peak element will be greater than left and right
            if(arr[mid - 1] < arr[mid] && arr[mid] > arr[mid + 1]) return mid;
            
            //If arr[mid + 1] < arr[mid] 
            //then getting peak element(largest) will never happen in the right part of the array
            //kuki sab chote he honge since there is only one increasing and one decreasing sequence
            else if(arr[mid + 1] < arr[mid]) right = mid - 1;
            
            
            else left = mid + 1;
        }
        return -1;
    }
}

/*

NOTE:
====

-> No need to check for mid - 1 >= 0 && mid + 1 <= arr.length - 1,
-> Because there always exists a mountain, so while loop will never terminate because of left > right
-> Hence no ArrayIndexOutOfBounds Exception

*/

//=============================================================================================================

//TC : O(N)

class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int len = arr.length;
        for(int i = 0; i < len - 1; i++) {
            if(arr[i] > arr[i + 1]) {
                return i;
            }
        }
        return -1;
    }
}

