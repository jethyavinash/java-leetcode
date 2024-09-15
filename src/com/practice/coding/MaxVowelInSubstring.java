package com.practice.coding;

public class MaxVowelInSubstring {
    public static void main(String[] args) {
        String s = "zaeixoyuxyz"; int k = 7;
        int maxVowels = maxVowelsInSubstring(s,k);
        System.out.println(maxVowels);
    }
    public static int maxVowelsInSubstring(String input,int k){
        char[] charArr = input.toCharArray();
        int maxVowel = 0;
        int currentVowel = 0;
        for(int i=0;i<k;i++){
            if(isVowel(charArr,i)){
                maxVowel++;
            }
        }

        currentVowel = maxVowel;
        for(int i=k;i<input.length();i++){
            if(isVowel(charArr, k)){
                currentVowel++;
            }
            if(isVowel(charArr, i-k)){
                currentVowel--;
            }
            maxVowel = Math.max(maxVowel,currentVowel);
        }
        return maxVowel;
    }

    private static boolean isVowel(char[] charInputArr, int i) {
        if(charInputArr[i] == 'a' || charInputArr[i] == 'e' || charInputArr[i] == 'i' || charInputArr[i] == 'o'|| charInputArr[i] == 'u'){
            return true;
        }
        return false;
    }

    public static class StackUsingArray<T> {
        private Object[] arr;
        private int top;

        public StackUsingArray(int length) {
            arr = new Object[length];
            top = -1;
        }

        public T pop() throws Exception {
            if(isEmpty()){
                throw new Exception("stack empty");
            }
            T e = (T) arr[top];
            arr[top--] = null;
            return e;
        }

        public void push(T element) throws Exception{
            if(top == arr.length - 1){
                throw new Exception("Stack is full");
            }
            arr[++top] = element;
        }

        public T peek() throws Exception{
            if(isEmpty()){
                throw new Exception("Stack is empty");
            }
            return (T)arr[top];
        }

        public boolean isEmpty(){
            return top == -1;
        }

        public static void main(String[] args) throws Exception {
            StackUsingArray<Integer> stackUsingArray = new StackUsingArray(5);
            stackUsingArray.push(1);
            stackUsingArray.push(2);
            stackUsingArray.push(3);
            stackUsingArray.push(4);
            stackUsingArray.push(5);

            System.out.println(stackUsingArray.pop());
            System.out.println(stackUsingArray.pop());
            System.out.println(stackUsingArray.pop());
            System.out.println(stackUsingArray.pop());
            System.out.println(stackUsingArray.pop());


        }
    }
}
