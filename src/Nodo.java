public class Nodo {
    private int informazione;
    private Nodo next;

    public Nodo(int informazione, Nodo next) {
        this.informazione = informazione;
        this.next = next;
    }

    public int getInformazione() {
        return informazione;
    }

    public void setInformazione(int informazione) {
        this.informazione = informazione;
    }

    public Nodo getNext() {
        return next;
    }

    public void setNext(Nodo next) {
        this.next = next;
    }
}
