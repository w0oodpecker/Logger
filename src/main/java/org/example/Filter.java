package org.example;

import java.util.ArrayList;
import java.util.List;

public class Filter {

    protected int treshold;

    public Filter(int treshold) {
        this.treshold = treshold;
    }

    public List<Integer> filterOut(List<Integer> source) {
        Logger logger = Logger.getInstance();
        List<Integer> result = new ArrayList<>();
        for(int index = 0; index < source.size(); index++){
            if(source.get(index) >= this.treshold){
                logger.log("Элемент " + source.get(index) + " проходит");
                result.add(source.get(index));
            }
            else {
                logger.log("Элемент " + source.get(index) + " не проходит");
            }
        }
        return result;
    }
}
