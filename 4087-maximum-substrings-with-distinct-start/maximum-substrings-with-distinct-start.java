class Solution {
    public int maxDistinct(String s) {

        // char[] ch = s.toCharArray();

        // HashSet<Character> map = new HashSet<>();
        // int count = 0;

        // for(char c : ch){
        //     if(!map.contains(c)){
        //         map.add(c);
        //         count++;
        //     }
        // }

        // return count;
        
        boolean[] res = new boolean[26];
        int count = 0;

        for(int i = 0;i<s.length();i++){
            int ch =  s.charAt(i) - 'a';

            if(!res[ch]){
                res[ch] = true;
                count++;
            }
        }

        return count;
    }
}