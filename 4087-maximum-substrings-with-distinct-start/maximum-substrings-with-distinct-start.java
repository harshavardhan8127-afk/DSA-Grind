class Solution {
    public int maxDistinct(String s) {

        char[] ch = s.toCharArray();

        HashSet<Character> map = new HashSet<>();
        int count = 0;

        for(char c : ch){
            if(!map.contains(c)){
                map.add(c);
                count++;
            }
        }

        return count;
    }
}