### 17. Letter Combinations of a Phone Number
Medium

------------

Given a string containing digits from 2-9 inclusive, return all possible letter combinations that the number could represent. Return the answer **in any order**.

A mapping of digit to letters (just like on the telephone buttons) is given below. Note that 1 does not map to any letters.

![image](https://upload.wikimedia.org/wikipedia/commons/thumb/7/73/Telephone-keypad2.svg/200px-Telephone-keypad2.svg.png)

##### Example 1:

```
Input: digits = "23"
Output: ["ad","ae","af","bd","be","bf","cd","ce","cf"]
```

##### Example 2:

```
Input: digits = ""
Output: []
```

##### Example 3:

```
Input: digits = "2"
Output: ["a","b","c"]
```

## Solution
```java
class Solution {
    final static HashMap<Character,String> map = new HashMap<>(){{
        put('2',"abc");
        put('3',"def");
        put('4',"ghi");
        put('5',"jkl");
        put('6',"mno");
        put('7',"pqrs");
        put('8',"tuv");
        put('9',"wxyz");
    }};
    public List<String> result = new ArrayList<>();

    public List<String> letterCombinations(String digits) {
        if (digits.length() == 0) return result;
        
        Combinator(new StringBuilder(), digits, 0);
        return result;
    }
    
    public void Combinator(StringBuilder temp, String digits, int index){
        if(index == digits.length()){
            result.add(temp.toString());
            return;
        }

        String cur = map.get(digits.charAt(index));  
        for (int i = 0; i < cur.length(); i++){
            temp.append(cur.charAt(i));
            Combinator(temp, digits, index + 1);
            temp.deleteCharAt(temp.length() - 1);
        }
    }
}
```
