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