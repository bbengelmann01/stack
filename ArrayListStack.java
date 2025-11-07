import java.util.ArrayList;

public class ArrayListStack {
    ArrayList<Integer> elements;

    public ArrayListStack() {
        elements = new ArrayList<Integer>();
    }

    public void push(int el) {
        elements.add(el);
    } 

    public void pop() {
        elements.remove(elements.size() - 1);
    }

    public int peek() {
        elements.get(elements.size() - 1);
    }

    public boolean isEmpty() {
        if (elements.size() == 0) {
            return true;
        }
        return false;
    }
    public int size() {
        return elements.size();
    }
    public String toString() {
        return elements.toString();
    }
}

