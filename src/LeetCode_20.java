/**
 * 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。
 *
 * 有效字符串需满足：
 *
 * 左括号必须用相同类型的右括号闭合。
 * 左括号必须以正确的顺序闭合。
 * 注意空字符串可被认为是有效字符串。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/valid-parentheses
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */


import java.util.Stack;
public class LeetCode_20 {
    public static void main(String[] args){
        Solution_20 so = new Solution_20();
        System.out.println(so.isValid("(asd{}{dsa}{x}[])"));
    }
}


class Solution_20 {//利用栈处理此题，左符进栈，右符出栈，栈空返回true
    public boolean isValid(String s) {
        char[] ch;
        ch = s.toCharArray();
        Stack<Character> stack = new Stack();
        for(char c : ch){
            if(c == '(' || c == '{' || c == '[' ){  //入栈
                stack.push(c);
            }
            if(!stack.isEmpty()&&((c == ')'&&stack.peek() != '(') || (c == '}' && stack.peek() != '{') || (c == ']' && stack.peek() != '['))){
                stack.push(c);
            }
            if(stack.isEmpty()&& (c == ')' || c == '}' || c == ']' )){
                stack.push(c);
            }
            if(!stack.empty() && ((c == ')'&&stack.peek() == '(') || (c == '}' && stack.peek() == '{') || (c == ']' && stack.peek() == '['))){
                stack.pop();
                }
        }
        if(stack.empty())
            return true;
        else
            return false;
    }
}