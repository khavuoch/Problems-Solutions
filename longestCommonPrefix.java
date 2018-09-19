public String longestCommonPrefix(String[] strs) {
    String result = "";
    int minLength = 0;
    int minLengthIndex = 0;
    if(strs == null || strs.length == 0){
        return "";
    }else{
        minLength = strs[0].length(); // set the length of the 1st item as initial length
    }
    for(int i = 1; i < strs.length; i++){
        if(strs[i].length() < minLength){
            minLength = strs[i].length();
            minLengthIndex = i;
        }
    }
    char sub = ' ';
    for(int i = 0; i < minLength; i++){ // i is the number of shortest string in the list
        sub = strs[0].charAt(i);
        for(int k = 0; k < strs.length; k++){ // k is the number of item in list
            if(k + 1 < strs.length && sub != (strs[k+1].charAt(i))){
                return strs[k].substring(0, i);
            }
        }
    }
    return strs[minLengthIndex];
}
