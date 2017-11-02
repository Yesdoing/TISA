package baeminSecondTest;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Two {
	public static void main(String[] args) {
		String s = "13 DUP 4 POP 5 DUP + DUP + -";
		System.out.println(solution(s));
	}
	
	
    public static int solution(String S) {
    		String[] temp = S.split(" ");
    		Stack<Integer> stack = new Stack<>();
    		for(String str : temp) {
    			if(str.equals("+") ) {
    				if(stack.size() < 2) {
    					return -1;
    				} 
    				
    				int num1 = stack.pop();
    				int num2 = stack.pop();
    				stack.push(num1+num2);
    			} else if(str.equals("-")) {
    				if(stack.size() < 2) {
    					return -1;
    				} 
    				
    				int num1 = stack.pop();
    				int num2 = stack.pop();
    				if(num1 - num2 < 0) {
    					return -1;
    				} 
    				stack.push(num1 - num2);
    			} else if(str.equals("DUP")) {
    				int num = stack.peek();
    				stack.push(num);
    			} else if(str.equals("POP")) {
    				stack.pop();
    			}
    			else {
    				stack.push(Integer.parseInt(str));
    			}
    		}
    		
    		return stack.pop();
    }

}
