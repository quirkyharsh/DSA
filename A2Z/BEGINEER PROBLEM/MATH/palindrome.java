class Solution {
    public boolean isPalindrome(int n) {
        int newNum = 0;
        int oldNum = n;
        while(oldNum > 0){
            newNum = newNum*10 + oldNum%10;
            oldNum = oldNum/10;
        }

        if(newNum == n){
            return true;
        }

        return false;
    }
}