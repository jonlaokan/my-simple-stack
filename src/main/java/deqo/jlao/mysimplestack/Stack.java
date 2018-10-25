package deqo.jlao.mysimplestack;

import java.util.ArrayList;
import java.util.EmptyStackException;


public class Stack implements SimpleStack {
    private ArrayList<Item> stack;

    Stack() {
        stack = new ArrayList<>();
    }

    @Override
    /*
        Add an element to the stack
     */
    public void push(Item item) {
        stack.add(0,item);
    }

    @Override
    /*
        Check it the stack is empty
     */
    public boolean isEmpty() {
        return stack.isEmpty();
    }


    @Override
    /*
        Get the size of the stack
     */
    public int getSize() {
        return stack.size();
    }

    @Override
    /*
        Peek the first element of the stack, without removing it from the stack
     */
    public Item peek() throws EmptyStackException {
        if (this.isEmpty()) throw new EmptyStackException();
        return stack.get(0);
    }

    @Override
    /*
        Remove the first elements of the stack
        @return first element
     */
    public Item pop() throws EmptyStackException {
        if (this.isEmpty()) throw new EmptyStackException();
        return stack.remove(0);
    }
}
