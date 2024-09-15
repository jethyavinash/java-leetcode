package com.practice.coding.stack;

public class Stack<T> {
        private Node<T> top;
        private static class Node<T>{
            private T data;
            private Node<T> next;

            public Node(T data){
                this.data = data;
            }
        }

        public void push(T data){
               Node<T> node = new Node<>(data);
               node.next = top;
               top = node;
        }

        public T pop() throws Exception {
                if(isEmpty()){
                        throw new Exception("Stack is empty");
                }
                T data = top.data;
                top = top.next;
                return data;
        }

        public T peek() throws Exception {
                if(isEmpty()){
                        throw new Exception("Stack is empty");
                }
                return top.data;
        }

        private boolean isEmpty(){
                return top == null;
        }

}

class Test{
        public static void main(String[] args) throws Exception {
                Stack<String> stack = new Stack<>();
                stack.push("a");
                stack.push("b");
                stack.push("3");

                System.out.println(stack.peek());
                System.out.println(stack.pop());
                System.out.println(stack.peek());
        }
}


