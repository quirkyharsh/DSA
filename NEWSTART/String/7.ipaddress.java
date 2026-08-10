class Solution {
    public boolean isValid(String s) {
        // code here
        String arr[] = s.split("\\.", -1);
        
        if(arr.length != 4){
            return false;
        }
        
        for(String str: arr){
            if(str.length() == 0){
                return false;
            }
            
            int num = Integer.parseInt(str);

            if (num > 255) {
                return false;
            }
            
            if (str.length() > 1 && str.charAt(0) == '0') {
                return false;
            }
            
        
        }
        
        return true;
    }
}