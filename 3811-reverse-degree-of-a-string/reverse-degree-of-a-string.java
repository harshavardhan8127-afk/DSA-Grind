class Solution {
    public int reverseDegree(String s) {

    //  HashMap<Character, Integer> map = new HashMap<>();

    //  for(char ch = 'a'; ch <= 'z'; ch++){
    //     map.put(ch, 'z' - ch + 1);
    //  }

    //  int val = 0;
    //  for(int i=0;i<s.length();i++){
    //  val += (i+1) * map.get(s.charAt(i));
    //  }
    int val =0;
    for(int i=0;i<s.length();i++){
        char ch = s.charAt(i);
        int p = ('z'- ch + 1) * (i+1);
        val += p;
    }
      return val;  
    }
}