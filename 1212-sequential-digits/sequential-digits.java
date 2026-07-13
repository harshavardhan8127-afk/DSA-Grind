class Solution {
    public List<Integer> sequentialDigits(int low, int high) {

        // String[] subs = new String[36];
        List<Integer> res = new ArrayList<>();
        String s = "123456789";
        // int id = 0;

        // for(int i=0;i<=s.length();i++){
        //     for(int j=i;j<=s.length();j++){
        //         if(j - i + 1 > 2){
        //             subs[id] = s.substring(i,j);
        //             id++;
        //         }
        //     }
        // }
        // Arrays.sort(subs,Comparator.comparingInt(String::length));
        // for(int i=0;i<subs.length;i++){
        //     int n = Integer.parseInt(subs[i]);

        //     if(n >= low && n <= high){
        //         res.add(n);
        //     }
        // }

         for(int i=0;i<=s.length();i++){
            for(int j=i;j<=s.length();j++){
                if(j - i + 1 > 2){
                    String sub = s.substring(i,j);
                    int n = Integer.parseInt(sub);
                    if(n >= low && n <= high){
                        res.add(n);
                    }
                }
            }
        }
        Collections.sort(res);

        return res;
        
    }
}