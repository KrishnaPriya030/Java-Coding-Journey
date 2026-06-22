class Solution {
    public int findComplement(int num) {

        int bits = 32 - Integer.numberOfLeadingZeros(num);

        int mask = (1 << bits) - 1;

        return num ^ mask;
    }
}
