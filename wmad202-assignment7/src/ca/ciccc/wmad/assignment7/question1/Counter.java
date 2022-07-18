package ca.ciccc.wmad.assignment7.question1;

import java.util.ArrayList;

public class Counter<E extends Specifier>{ //

    private ArrayList<E> objects;

    public Counter (ArrayList<E> objects){
        this.objects = objects;
    }
    public int countNumberOfElementsWithSpecificProperty() {
        int count = 0;

        for(E object  : this.objects){
            if(object.hasSpecificValue()){
                count = count + 1;
            }
        }
        return count;
    }

}
