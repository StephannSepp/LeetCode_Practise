### 1641. Count Sorted Vowel Strings
Medium

------------

Given an integer n, return the number of strings of length n that consist only of vowels (a, e, i, o, u) and are lexicographically sorted.

A string s is lexicographically sorted if for all valid i, s[i] is the same as or comes before s[i+1] in the alphabet.

##### Example 1:

> Input: n = 1  
Output: 5  
Explanation: The 5 sorted strings that consist of vowels only are ["a","e","i","o","u"].

##### Example 2:

> Input: n = 2  
Output: 15  
Explanation: The 15 sorted strings that consist of vowels only are  
["aa","ae","ai","ao","au","ee","ei","eo","eu","ii","io","iu","oo","ou","uu"].  
Note that "ea" is not a valid string since 'e' comes after 'a' in the alphabet.

##### Example 2:

> Input: n = 33  
Output: 66045

## Solution
```java
class Solution {
    public int countVowelStrings(int n) {
        int a = 1, e = 1, i = 1, o = 1, u = 1;
        for (int index = 1; index < n; index++){
            a = a + e + i + o + u;
            e = e + i + o + u;
            i = i + o + u;
            o = o + u;
        }
        return a + e + i + o + u;
    }
}
```

~~Mathematical way~~
```java
class Solution {
    public int countVowelStrings(int n) {
        return ((n+4) * (n+3) * (n+2) * (n+1) / 24);
    }
}
```