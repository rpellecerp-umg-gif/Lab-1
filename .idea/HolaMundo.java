import java.util.Stack;

public class HolaMundo {
    public static void main(String[] args) {
        IO.println("Hola Mundo");

        var pila = new Stack<Integer>();

        pila.push(10);
        pila.push(20);
        pila.push(30);

        IO.println("Cima: " + pila.peek()); // 30

        while (!pila.isEmpty()) {
            IO.println(pila.pop());
        }
    }
}