class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs==null || strs.length==0)
        return "";
        String prfx=strs[0];
        for(String s:strs)
        {

        while(s.indexOf(prfx)!=0){
        prfx=prfx.substring(0,prfx.length()-1);}}
    return prfx;
        
    }
}