class Solution {
    public String removeOccurrences(String s, String part) {

        StringBuilder str = new StringBuilder();

        for(char ch : s.toCharArray()){
              str.append(ch);

           if(str.length() >= part.length()){
            int index = str.length() - part.length();

            if(str.substring(index).equals(part)){
                str.delete(index,str.length());
            }
           }


        }
        return str.toString();
    }
}