class Solution {
    public int subtractProductAndSum(int n) {
        int sum = 0, mul = 1, m;
        while (n > 0){
            m = n % 10;
            sum += m;
            mul *= m;
            n = n / 10;
        }
        return (mul - sum);
    }
}