import java.util.Stack;

/*
 * @lc app=leetcode.cn id=155 lang=java
 *
 * [155] 最小栈
 */
//设计两个栈，正常栈进栈出栈时，最小值栈里面也不断往里面放或取最小flag，这样最小值栈栈顶永远都是flag,而且两个栈的个数也是一样的
class MinStack {
    //两个栈，一个是放min的，一个是正常栈，一个Min flag
    private Stack<Integer> dataStack;
    private Stack<Integer> minStack;
    private int min;
    /** initialize your data structure here. */
    public MinStack() {
        dataStack= new Stack<>();
        minStack = new Stack<>();
        min=Integer.MAX_VALUE;
    }
    //add的时候和最小值判断一下，增加一个也多放一个最小值，minstack栈顶永远是最小的
    public void push(int x) {
        dataStack.add(x);
        min=Math.min(min,x);
        minStack.add(min);
    }
    
    //pop的时候minStack也出一个，如果空了min重新赋值，不空就将min等与minstack栈顶元素
    public void pop() {
        dataStack.pop();
        minStack.pop();
        min=minStack.isEmpty()? Integer.MAX_VALUE:minStack.peek();
    }
    
    public int top() {
        return dataStack.peek(); 
    }
    
    public int getMin() {
        return minStack.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */

