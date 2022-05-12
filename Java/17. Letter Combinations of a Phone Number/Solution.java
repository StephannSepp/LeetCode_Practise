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