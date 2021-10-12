class Solution {
    public boolean isPalindrome(int x) {
        if(x<0)
            return false;
        int sum = 0;
        int temp = x;
        while(temp!=0){
            int rem = temp%10; 
            sum=(sum*10)+rem;
            temp/=10;
        }
        if(sum==x)
            return true;
        return false;
    }
}
