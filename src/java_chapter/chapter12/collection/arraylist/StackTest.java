package java_chapter.chapter12.collection.arraylist;

import java.util.ArrayList;

class MyStack{
    private ArrayList<String> arrayStack = new ArrayList<String>();

    public void push(String data) {
        arrayStack.add(data);
    }

    public String pop() {
        int len = arrayStack.size();
        if(len ==0) {
            System.out.println("스택이 비었습니다.");
            return null;
        }
        String data = arrayStack.remove(len-1); //정보 넘겨주고 지움
        return data;
    }
    public String peek() {
        int len = arrayStack.size();
        if(len ==0) {
            System.out.println("스택이 비었습니다.");
            return null;
        }
        String data = arrayStack.get(len-1); //꺼내보기
        return data;
    }
}

public class StackTest {
    public static void main(String[] args) {

        MyStack stack = new MyStack();
        stack.push("a");
        stack.push("b");
        stack.push("c");
        System.out.println(stack.peek());
        System.out.println(stack.peek());
        System.out.println(stack.peek());

        System.out.println();

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

    }

}