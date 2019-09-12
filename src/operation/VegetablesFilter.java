package operation;

import java.util.ArrayList;
import java.util.List;

import exception.VegetableIsNotFoundException;
import structure.Vegetable;


public class VegetablesFilter {


    public List<Vegetable> findVegetableByParameters(List<Vegetable> salad, int filterForWeight, int filterForCalories) throws VegetableIsNotFoundException {

        List<Vegetable> vegetableList = new ArrayList<>();

        for (Vegetable vegetable :
                salad) {
            if (vegetable.getWeight() == filterForWeight && vegetable.getCalories() == filterForCalories) {
                vegetableList.add(vegetable);
            }
        }
        if (vegetableList.size() < 1) {
            throw new VegetableIsNotFoundException("Vegetable is not defined using proposed filter");
        }
        return vegetableList;
    }
}