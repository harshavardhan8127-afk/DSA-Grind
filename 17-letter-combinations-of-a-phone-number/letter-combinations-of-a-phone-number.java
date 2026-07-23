class Solution {
    public List<String> letterCombinations(String digits) {

        List<String> ans = new ArrayList<>();

        if(digits.length() == 0){
            return new ArrayList();
        }

        String[] letters = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};


        return helper("",digits,letters);
    }
    public static List<String> helper(String p,String up,String[] letters){
        if(up.isEmpty()){
            List<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        // this is the local 
        List<String> res = new ArrayList<>();
        int digit = up.charAt(0) - '0';
        String key = letters[digit];
        for(int i=0;i<key.length();i++){
            char ch = key.charAt(i);
            res.addAll(helper(p+ch,up.substring(1),letters));
        }

        return res;
    }

}