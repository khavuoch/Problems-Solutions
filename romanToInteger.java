public int romanToInt(String s) {
    Map map = new HashMap();
    map.put('I', 1);
    map.put('V', 5);
    map.put('X', 10);
    map.put('L', 50);
    map.put('C', 100);
    map.put('D', 500);
    map.put('M', 1000);

    int result = 0;

    for(int i = 0; i < s.length(); i++){
        char value = s.charAt(i);
        System.out.print(map.get(value));
        if(value == 'I'){
            if((i+1 < s.length()) && (s.charAt(i+1) == 'V' || s.charAt(i+1) == 'X')){
                result += (int)map.get(s.charAt(i+1)) - (int)map.get(value);
                i++;
            }else{
                result += (int)map.get(value);
            }
        }
        else if(value == 'X'){
            if((i+1 < s.length()) && (s.charAt(i+1) == 'L' || s.charAt(i+1) == 'C')){
                result += (int)map.get(s.charAt(i+1)) - (int)map.get(value);
                i++;
            }else{
                result += (int)map.get(value);
            }
        }
        else if(value == 'C'){
            if((i+1 < s.length()) && (s.charAt(i+1) == 'D' || s.charAt(i+1) == 'M')){
                result += (int)map.get(s.charAt(i+1)) - (int)map.get(value);
                i++;
            }else{
                result += (int)map.get(value);
            }
        }
        else result += (int)map.get(value);
    }
    return result;
}
