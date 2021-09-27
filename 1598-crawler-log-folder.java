//https://leetcode.com/problems/crawler-log-folder/

class Solution {
    public int minOperations(String[] logs) {
        int len = logs.length;
        Stack<String> stack = new Stack<>();
        stack.push("Main");
        for(int i = 0; i < len; i++) {
            if(logs[i].equals("./")) continue; //Remain in same folder
            else if(logs[i].equals("../")) {
                if(stack.peek().equals("Main")) continue; //Already at parent
                else stack.pop(); //Go to one level back of the heirarchy
            }
            else stack.push(logs[i]); //Go to one level up of the heirarchy
        }
        int count = 0;
        while(!stack.peek().equals("Main")) { //Pop until you reach to Main
            stack.pop();
            count++;
        }
        return count;
    }
}
