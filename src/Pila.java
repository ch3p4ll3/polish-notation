public class Pila {
    private Nodo cima;

    public Pila() {
        cima = null;
    }

    public void push(int n) {
        cima = new Nodo(n, cima);
    }

    public int pop() {
        int e;
        e = cima.getInformazione();
        cima = cima.getNext();
        return e;
    }

    public boolean isEmpty() {
        return cima == null;
    }
}
