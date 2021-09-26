//https://leetcode.com/problems/remove-palindromic-subsequences/

/*
Intuition
=========
If it's empty sting, return 0;
If it's palindrome, return 1;
Otherwise, we need at least 2 operation.

Explanation
===========
We can delete all characters 'a' in the 1st operation,
and then all characters 'b' in the 2nd operation.
So return 2 in this case

Why are we doing that ? Because:-
=======================
1) It's given, in a single step you can remove one palindromic "subsequence" from s
2) String would consist of only 'a' and 'b' letters
Ex: "ababa"
-> "aaa" alone is a palindromic subsequence
-> "bb" alone is a palindromic subsequence
Hence, we require minimum 2 steps to delete the 2 groups.
*/

class Solution {
    public int removePalindromeSub(String s) {
        int len = s.length();
        if(len == 0) return 0;
        
        int i = 0, j = len - 1;
        while(i < j) {
            if(s.charAt(i++) != s.charAt(j--)) {
                return 2;
            }
        }
        return 1;
    }
}
