public class LinkedListStack {
    LinkedList<Integer> elements;

    public ArrayListStack() {
        elements = new LinkedList<Integer>();
    }

    public void push(int el) {
        elements.add(0);
    } 

    public void pop() {
        elements.remove(0);
    }

    public int peek() {
        elements.get(0);
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

