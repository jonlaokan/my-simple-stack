package deqo.jlao.mysimplestack;

import java.util.EmptyStackException;


public class Stack implements SimpleStack {
    private int size;
    private Item[] stack;
    private int top;

    Stack(int maxSize) {
        size = 0;
        stack = new Item[maxSize];
        top = -1;
    }

    @Override
    public void push(Item item) {
        stack[++top] = item;
        size++;
    }

    @Override
    public boolean isEmpty() {
        return top == -1;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public Item peek() throws EmptyStackException {
        if (this.isEmpty()) throw new EmptyStackException();
        return stack[top];
    }

    @Override
    public Item pop() throws EmptyStackException {
        if (this.isEmpty()) throw new EmptyStackException();
        return stack[top--];
    }
}
