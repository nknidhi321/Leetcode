//https://leetcode.com/problems/check-if-a-word-occurs-as-a-prefix-of-any-word-in-a-sentence/

class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {
        int sentenceLen = sentence.length();
        int searchWordLen = searchWord.length();
        int spaceCount = 0;
        
        for(int i = 0; i < sentenceLen; i++) {
            int count = 0;
            if(sentence.charAt(i) == ' ') spaceCount++;
            if((i == 0 && sentence.charAt(i) == searchWord.charAt(0) ||
               (i > 0 && sentence.charAt(i - 1) == ' ' && sentence.charAt(i) == searchWord.charAt(0)))){
                for(int j = i, k = 0; k < searchWordLen; j++, k++) {
                    if(sentence.charAt(j) != searchWord.charAt(k)) break;
                    else count++;
                }
                if(count == searchWordLen) return spaceCount + 1;
            }
        }
        return -1;
    }
}
