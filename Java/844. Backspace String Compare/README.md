### 844. Backspace String Compare
Easy

------------

Given two strings s and t, return true if they are equal when both are typed into empty text editors. '#' means a backspace character.

Note that after backspacing an empty text, the text will continue empty.

##### Example 1:

```
Input: s = "ab#c", t = "ad#c"  
Output: true  
Explanation: Both s and t become "ac".
```

##### Example 2:

```
Input: s = "ab##", t = "c#d#"  
Output: true  
Explanation: Both s and t become "".
```

##### Example 3:

```
Input: s = "a#c", t = "b"  
Output: false  
Explanation: s becomes "c" while t becomes "b".
```

## Solution
```java
class Solution {
    public String func(String str){
        StringBuilder sb = new StringBuilder();
        int n = str.length();
        for (int i = 0; i < n; i++){
            if (str.charAt(i) == '#'){
                if (sb.length() > 0){
                    sb.deleteCharAt(sb.length() - 1);
                }
            } else {
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }
    public boolean backspaceCompare(String s, String t) {
        s = func(s);
        t = func(t);
        System.out.println(s+" "+t);
        return s.equals(t);
    }
}
```
