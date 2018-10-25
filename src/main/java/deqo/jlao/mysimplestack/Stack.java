package deqo.jlao.mysimplestack;

import java.util.ArrayList;
import java.util.EmptyStackException;


public class Stack implements SimpleStack {
    private ArrayList<Item> stack;

    Stack() {
        stack = new ArrayList<>();
    }

    @Override
    public void push(Item item) {
        stack.add(0,item);
    }

    @Override
    public boolean isEmpty() {
        return stack.isEmpty();
    }

    @Override
    public int getSize() {
        return stack.size();
    }

    @Override
    public Item peek() throws EmptyStackException {
        if (this.isEmpty()) throw new EmptyStackException();
        return stack.get(0);
    }

    @Override
    public Item pop() throws EmptyStackException {
        if (this.isEmpty()) throw new EmptyStackException();
        return stack.remove(0);
    }
}
