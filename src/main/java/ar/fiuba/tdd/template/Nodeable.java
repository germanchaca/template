package ar.fiuba.tdd.template;

import ar.fiuba.tdd.template.exceptions.EmptyException;

/**
 * Created by german on 8/29/2016.
 */
public interface Nodeable<S> {

    Nodeable next() throws EmptyException;

    void setNext(Nodeable<S> next);

    void setAtEnd(Nodeable<S> node);

    S data() throws EmptyException;

    boolean isEmpty();

    int getTotalLinkedNodes();
}
