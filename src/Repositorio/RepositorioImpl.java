package Repositorio;

import java.util.ArrayList;
import java.util.List;

public class RepositorioImpl<T> implements Repositorio<T>{

    private List<T> lista = new ArrayList<>();

    @Override
    public void add(T t) {
        this.lista.add(t);
    }
    @Override
    public void remove(T t){
        this.lista.remove(t);
    }

    @Override
    public T update(Integer i,T t){
        return this.lista.set(i,t);
    }

    @Override
    public List<T> list(){
        return this.lista;
    }
}
