package 균형잡힌세상;

import java.util.*;

public class Main{
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	Stack<Character>stack  = new Stack<>();
    	while(true) {
    		stack.clear();
    		String str = sc.nextLine();
    		if(str.equals(".")) {
    			break;
    		}
    		for(int i =0; i<str.length(); i++) {
    			if(str.charAt(i)=='(' || str.charAt(i)=='[') {
    				stack.push(str.charAt(i));
    			}else if(str.charAt(i)==')' ) {
    				if(!stack.empty() && stack.peek()=='(') {
    					stack.pop();
    				}else {
    					stack.push(')');
    					break;
    				}
    			}else if(str.charAt(i)==']') {
    				if(!stack.empty() && stack.peek() =='[') {
    					stack.pop();
    				}else {
    					stack.push(']');
    					break;
    				}
    			}
    			
    		}
    		if(stack.isEmpty()) {
        		System.out.println("yes");
        	}else {
        		System.out.println("no");
        	}
    	}
    	
    }
    
}

