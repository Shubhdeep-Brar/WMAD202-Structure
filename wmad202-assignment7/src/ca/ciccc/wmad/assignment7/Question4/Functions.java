package ca.ciccc.wmad.assignment7.Question4;

import java.util.ArrayList;

public class Functions <E> {

    private ArrayList<E> list;

    public Functions(){
        this.list = new ArrayList<>();
    }

    public Functions(ArrayList<E> list){
        this.list = list;
    }
    public void addItemToList(E item){
        list.add(item);
    }

    public void removeItemFromList(E item){
        list.remove(item);
    }
    public ArrayList<E>  performSearchOperation (E item){
        ArrayList<E> newList = new ArrayList<>();
        for(E element : this.list){
            if(element == item){
                newList.add(element);
            }
        }
        if(newList.isEmpty()){
            return null;
        }
        else;
            return newList;

    }



}
