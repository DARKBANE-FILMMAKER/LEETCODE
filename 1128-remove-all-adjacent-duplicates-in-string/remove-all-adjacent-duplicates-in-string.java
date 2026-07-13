class Solution {
    public String removeDuplicates(String s) {
    Stack<Character>stack=new Stack<>();

    for(char ch:s.toCharArray())
    {
        if(!stack.empty() && ch==stack.peek())

        stack.pop();
        else
        stack.push(ch);
    }
StringBuffer sb=new StringBuffer();
for(char ch:stack)
{
    sb.append(ch);
}
    
    return sb.toString();    
    }
}