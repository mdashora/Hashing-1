// TC - O(n)
// SC - O(1) - As There are limited characters in engligh alphabet(26).

// We use two hashmaps to solve this problem.
class Isomorphic {
    public boolean isIsomorphic(String s, String t) {
        Map<Character, Character> sMap = new HashMap<>();
        Map<Character, Character> tMap = new HashMap<>();

        if(s.length()!=t.length()){
            return false;
        }

        for(int i=0; i<s.length(); i++){
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);

            // Check in sMap if value exists otherwise enter.
            if(sMap.containsKey(sChar)){
                if(sMap.get(sChar)!=tChar){
                    return false;
                }
            }
            else{
                sMap.put(sChar, tChar);
            }

            // Check in tMap if value exists otherwise enter.
            if(tMap.containsKey(tChar)){
                if(tMap.get(tChar)!=sChar){
                    return false;
                }
            }
            else{
                tMap.put(tChar, sChar);
            }
        }

        return true;
    }
}