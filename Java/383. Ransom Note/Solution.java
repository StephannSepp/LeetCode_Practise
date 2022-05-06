class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        for (int i = 0; i < ransomNote.length(); i++){
            if(magazine.contains(Character.toString(ransomNote.charAt(i)))){
                magazine = magazine.replaceFirst(Character.toString(ransomNote.charAt(i)),"");
            } else {
                return false;
            }
        }
        return true;
    }
}