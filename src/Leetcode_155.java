import java.util.ArrayList;

/**
 * 设计一个支持 push，pop，top 操作，并能在常数时间内检索到最小元素的栈。
 *
 * push(x) -- 将元素 x 推入栈中。
 * pop() -- 删除栈顶的元素。
 * top() -- 获取栈顶元素。
 * getMin() -- 检索栈中的最小元素。
 * 示例:
 *
 * MinStack minStack = new MinStack();
 * minStack.push(-2);
 * minStack.push(0);
 * minStack.push(-3);
 * minStack.getMin();   --> 返回 -3.
 * minStack.pop();
 * minStack.top();      --> 返回 0.
 * minStack.getMin();   --> 返回 -2.
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/min-stack
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */

public class Leetcode_155 {
    public static void main(String[] args){
        MinStack stack = new MinStack();
        stack.push(-2);
        stack.push(0);
        stack.push(-3);
        System.out.println(stack.top());
        System.out.println(stack.getMin());
    }
}

class MinStack {
    int pointer;
    ArrayList<Integer> stack ;
    /** initialize your data structure here. */
    public MinStack() {
        this.stack = new ArrayList<>();
        pointer = -1;
    }

    public void push(int x) {
        stack.add(x);
        pointer ++;
    }

    public void pop() {
        stack.remove(pointer);
        pointer --;
    }

    public int top() {
        return stack.get(pointer);
    }

    public int getMin() {
        int[] temp = new int[stack.size()];
        int t;
        for(int size=0;size<stack.size();size++){
            temp[size] = stack.get(size);
        }
        for(int size=1;size<stack.size();size++){
            if(temp[0] > temp[size]){
                t = temp[0];
                temp[0] = temp[size];
                temp[size] = t;
            }
        }
        return temp[0];
    }
}