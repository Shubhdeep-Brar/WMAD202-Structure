package ca.ciccc.wmad.assignment7.Question3;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ElementExchanger<E> {
    private ArrayList<E> list;

    public ElementExchanger(ArrayList<E> list){
        this.list = list;
    }

    public void exchangeElements(Integer index1, Integer index2 ){
        E element1 = this.list.get(index1);
        E element2 = this.list.get(index2);

        this.list.set(index1, element2);
        this.list.set(index2, element1);

    }
    public ArrayList<E> getList(){
        return this.list;
    }
}
