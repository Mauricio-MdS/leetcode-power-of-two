class Solution {
    public boolean isPowerOfTwo(int n) {
        // checks if n is positive and last bit is 0
        return n > 0 && (n & (n - 1)) == 0;
    }
}