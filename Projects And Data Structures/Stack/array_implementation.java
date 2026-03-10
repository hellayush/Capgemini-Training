package basic;
import java.util.*;

class Stack {
    int arr[] = new int[10];
    int indx = 0;

    void push(int x) {
        if (isFull()) {
            System.out.println("Stack is Full");
            return;
        }
        arr[indx++] = x;
    }

    int peek() {
        if (indx == 0) return -1;
        return arr[indx - 1];
    }

    int pop() {
        if (indx == 0) return -1;
        return arr[--indx];
    }

    boolean isEmpty() {
        return indx == 0;
    }

    boolean isFull() {
        return indx == arr.length;
    }

    int Capacity() {
        return arr.length;
    }
}

public class array_implementation {
    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(10);
        st.push(20);
        System.out.println("Popped: " + st.pop()); 
        System.out.println("Top: " + st.peek());   
        System.out.println("Is Empty? " + st.isEmpty()); 
        System.out.println("Capacity: " + st.Capacity()); 
    }
}
