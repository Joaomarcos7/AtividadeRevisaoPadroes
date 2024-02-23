package Repositorio;

import java.util.ArrayList;
import java.util.List;

public interface Repositorio<T> {

    void add(T t);
    void remove(T t);

    T update(Integer i,T t);

    List<T> list ();
}
