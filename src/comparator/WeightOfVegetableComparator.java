package comparator;

import structure.Vegetable;

public class WeightOfVegetableComparator {

    public int compare(Vegetable vegetable1, Vegetable vegetable2) {
        return Double.compare(vegetable2.getCalories(), vegetable1.getCalories());
    }

}
