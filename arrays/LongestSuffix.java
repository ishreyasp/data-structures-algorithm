class LongestSuffix {
    public String longestSuffix(String[] strs) {
        if(strs==null || strs.length==0){
            return "";
        }

        for(int i=0; i<strs[0].length(); i++){
            for(String s : strs){
                if(i == s.length() || s.charAt(i) != strs[0].charAt(i)){
                    return s.substring(0, i);
                }
            }
        }
        return strs[0];
    }

    public static void main(String[] args) {
        LongestSuffix longestSuffix = new LongestSuffix();
        String[] strs = {"flower","flow","flight"};
        System.out.println(longestSuffix.longestSuffix(strs));
    }
}