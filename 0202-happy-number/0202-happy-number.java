class Solution {
    public int square(int num) {
        int ans = 0;
        while(num>0){
            int digit = num%10;
            ans += digit*digit;
            num/=10;
        }
        return ans;
    }
    public boolean isHappy(int n) {
        int slow = n, fast = n;
        do{
            slow = square(slow);
            fast = square(square(fast));
        } while(slow!=fast);
        //cycle detection, using slow and fast pointers.
        // if cycle exists, then not a happy number, and slow will have value other than 1
        return slow==1;
    }
}