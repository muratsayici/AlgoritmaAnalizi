/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mystack;

/**
 *
 * @author BMB
 */
public class mystack {

    private int top;
    private int[] storage ;
      mystack(int capacity) {
            if (capacity <= 0)
                  throw new IllegalArgumentException(
                             "Stack's capacity must be positive");
            storage = new int[capacity];
            top = -1;
      }

    void push(int value) {
        if (top == storage.length) {
            throw new StackException("Stack's underlying storage is overflow");
        }
        top++;
        storage[top] = value;
    }

    int pop() {
        if (top == -1) {
            throw new StackException("Stack is empty");
        }
        return storage[top--];
    }

    boolean isEmpty() {
        return (top == -1);
    }

    public class StackException extends RuntimeException {

        public StackException(String message) {
            super(message);
        }
    }

    public static void main(String[] args) {
        mystack a = new mystack(100);
        int b = 0;
        a.top = 0;
        a.push(5);
        a.push(15);
        a.push(25);
        b = a.pop();
        System.out.println(b);
        b = a.pop();
        System.out.println(b);
        b = a.pop();
        System.out.println(b);
        b = a.pop();
        System.out.println(b);

    }
}
