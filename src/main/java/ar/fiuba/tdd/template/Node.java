package ar.fiuba.tdd.template;

/**
 * Created by german on 8/29/2016.
 */
public class Node<S> implements Nodeable<S> {
    private Nodeable next;
    private S data;

    public Node(S data) {
        this.data = data;
    }

    @Override
    public Nodeable next() {
        return next;
    }

    @Override
    public void setNext(Nodeable<S> next) {
        this.next = next;
    }

    @Override
    public void setAtEnd(Nodeable<S> node) {
        next.setAtEnd(node);
    }

    @Override
    public S data() {
        return data;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public int getTotalLinkedNodes() {
        return 1 + next.getTotalLinkedNodes();
    }
}
