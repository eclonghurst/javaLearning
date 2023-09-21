package org.example;

import java.util.ArrayList;
import java.util.List;

public class Doggo {

    public List<String> DoggoComp(int placement){

        List<String> placementList = new ArrayList<>();

        for (int i =1; i < 101; i++){

            if (i == placement) { continue;}
            else if (i % 10 == 1 && i != 11) {placementList.add(i+"st");}
            else if (i % 10 == 2 && i != 12) {placementList.add(i+"nd");}
            else if (i % 10 == 3 && i != 13) {placementList.add(i+"rd");}
            else {placementList.add(i+"th");}
        }

        return placementList;
    }

}
