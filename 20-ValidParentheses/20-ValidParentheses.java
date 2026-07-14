// Last updated: 14/07/2026, 14:15:51
class Node {
    char data;
    Node link;
    Node(char data) {
        this.data = data;
        this.link = null;
    }
}

class LinkedStack {
    private Node top;

    LinkedStack() {
        top = null;
    }

    void push(char value) {
        Node newNode = new Node(value);
        newNode.link = top;
        top = newNode;
    }

    char pop() {
        if (isEmpty()) return 'e'; 
        char value = top.data;
        top = top.link;
        return value;
    }

    char peek() {
        if (isEmpty()) return 'e';
        return top.data;
    }

    boolean isEmpty() {
        return top == null;
    }
}

class Solution {
    public boolean isValid(String s) {
        LinkedStack stack = new LinkedStack();

        for (char c : s.toCharArray()) {
            
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
               
                if (stack.isEmpty()) return false;

                char top = stack.pop();
                if ((c == ')' && top != '(') ||
                    (c == '}' && top != '{') ||
                    (c == ']' && top != '[')) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}