package deqo.jlao.mysimplestack;

import java.util.EmptyStackException;
import java.util.Stack;

public interface SimpleStack {
    /**
     * Tests if this stack empty
     */
    boolean isEmpty();

    /**
     * Returns the number of items in this stack
     */
    int getSize();

    /**
     * Pushes an item on top of the stack
     */
    void push(Item item);

    /**
     * Look at the object on top of the stack without removing it
     */
    Item peek() throws EmptyStackException;

    /**
     * Pops an item from the top of the stack
     */
    Item pop() throws EmptyStackException;
}