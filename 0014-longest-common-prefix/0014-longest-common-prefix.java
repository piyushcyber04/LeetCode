class Solution {
    public String longestCommonPrefix(String[] strs) {
       if(strs==null||strs.length==0){
        return "";
       }
        String s1=strs[0];
       
        int len=s1.length();
        for(int i=1;i<strs.length;i++){
        String s2=strs[i];
        while(s1.length()>s2.length()||!s1.equals(s2.substring(0,len))){
                len--;
                if(len==0){return "";}

                s1=s1.substring(0,len);
        }
        
       
        }
        return s1;
    }
}