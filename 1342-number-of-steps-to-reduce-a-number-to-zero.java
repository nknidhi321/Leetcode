//https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/

/*
**Vaibhav** 
**Using Bitwise Operator**

**To check even odd :**
Even numbers last bit will always be 0
Odd numbers last bit will always be 1

So bitwise & with 1 will give you :-
(Even numbers last bit)0 & 1 => 0(Conclusion Even) 
(Odd numbers last bit)1 & 1 => 1(Conculsion Odd)
-----------------------------------------------------------------

**To divide it by 2 :**
Right shift the number by 1
-----------------------------------------------------------------

The Idea is to check if a number is even, Bitwise & the number with 1, now check if the results last bit is 0, then the number is even else odd.
And to divide it by 2, right shift the number by 1.
*/

class Solution {
    public int numberOfSteps(int num) {
        int count = 0;
        while(num > 0) {
            num = (num & 1) == 0 ? num >> 1 : num - 1;
            count++;
        }
        return count;
    }
}

//===================================================================================================================================================
//Mine
//Using normal division and modulo operator
class Solution {
    public int numberOfSteps(int num) {
        int count = 0;
        while(num > 0) {
            if(num % 2 == 0) num /= 2;
            else num--;
            count++;
        }
        return count;
    }
}
