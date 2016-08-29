package ar.fiuba.tdd.template;

import ar.fiuba.tdd.template.exceptions.EmptyException;

/**
 * Created by german on 8/29/2016.
 */
public interface Queueable<T> {
    boolean isEmpty();

    int size();

    void add(T item); //agregar un item

    T top() throws EmptyException;//retornar el primer item, lanzar excepsión si esta vacio

    void remove() throws EmptyException;//remover el primer item, lanzar expecion si esta vacío

}
