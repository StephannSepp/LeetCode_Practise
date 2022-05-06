### 1281. Subtract the Product and Sum of Digits of an Integer
Easy

------------

Given an integer number n, return the difference between the product of its digits and the sum of its digits.

##### Example 1:

> Input: n = 234<br />
Output: 15 <br />
Explanation: <br />
Product of digits = 2 * 3 * 4 = 24 <br />
Sum of digits = 2 + 3 + 4 = 9 <br />
Result = 24 - 9 = 15

##### Example 2:

> Input: n = 4421<br />
Output: 21<br />
Explanation: <br />
Product of digits = 4 * 4 * 2 * 1 = 32 <br />
Sum of digits = 4 + 4 + 2 + 1 = 11 <br />
Result = 32 - 11 = 21

## Solution
```java
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
```