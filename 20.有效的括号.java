import java.util.Stack;

/*
 * @lc app=leetcode.cn id=20 lang=java
 *
 * [20] 有效的括号
 */
//进一个判断一个，判断条件是只要一个符合，就不是有效的括号，要考虑进的东西不是3种括号之一
//如果遇到反括号，就出栈一个，和反括号做对比，看看是否匹配；
class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack=new Stack<>();
            for(char c :s.toCharArray()){
                if(c=='(' ||c=='{'||c=='['){
                    stack.push(c);
                }
               else { if(stack.isEmpty()) {return false;}
               char cStack=stack.pop();
                boolean b1=c==')'&& cStack!='(';
                boolean b2=c==']'&& cStack!='[';
                boolean b3=c=='}' && cStack!='{';
                if(b1||b2||b3){
                    return false;
                }
            }
            }
            return stack.isEmpty();
    }
}

