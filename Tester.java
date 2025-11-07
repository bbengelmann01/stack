public class Tester {
    public static void main(String[] args) {
        LinkedListStack linked = new LinkedListStack();
        ArrayListStack arr = new ArrayListStack();

        Console.log.println("testing push to LinkedListStack");
        linked.push(2);
        Console.log.println(linked.toString());
    }
}