class Solution {
    boolean isPalindrome(String s) {
        // code here
        
        boolean isPalindrome = true;
        
        int left = 0;
        int right = s.length() - 1;
        
        while(left < right){
            if(s.charAt(left) != s.charAt(right)){
                isPalindrome = false;
                break;
            }
            left++;
            right--;
            
        }
        
        if (isPalindrome)
            return true;
        else
            return false;
        
    }
}