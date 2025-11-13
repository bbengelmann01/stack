public class Tester {
    public static void main(String[] args) {
        LinkedListStack linked = new LinkedListStack();
        ArrayListStack arr = new ArrayListStack();

        System.out.println("testing push to LinkedListStack, expecting 2");
        linked.push(2);
        System.out.println(linked.toString());

        System.out.println("testing push to ArrayListStack, expecting 3");
        arr.push(3);
        System.out.println(arr.toString());

        System.out.println("testing peek to LinkedListStack, expecting 2");
        System.out.println(linked.peek());

        System.out.println("testing peek to ArrayListStack, expecting 3");
        System.out.println(arr.peek());

        System.out.println("testing pop to LinkedListStack, expecting nothing");
        linked.pop();
        System.out.println(linked.toString());

        System.out.println("testing pop to ArrayListStack, expecting nothing");
        arr.pop();
        System.out.println(arr.toString());
    }
}