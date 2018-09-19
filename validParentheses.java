public boolean isValid(String s) {
    if(s.length() == 0)
        return true;
    char ch = s.charAt(0);
    if(ch == ']' || ch == ')' || ch == '}') return false;
    Stack<Character> stack = new Stack<>();
    for(int i = 0; i < s.length(); i++){
        ch = s.charAt(i);

        if(ch == '(' || ch == '[' || ch == '{')
            stack.push(ch);
        else if(ch == ')'){
            if(!stack.isEmpty() && stack.peek() == '(')
                stack.pop();
            else return false;
        }
        else if(ch == ']'){
            if(!stack.isEmpty() && stack.peek() == '[')
                stack.pop();
            else return false;
        }
        else if(!stack.isEmpty() && ch == '}'){
            if(stack.peek() == '{')
                stack.pop();
            else return false;
        }
    }
    return stack.isEmpty();
}
