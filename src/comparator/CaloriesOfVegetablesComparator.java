package comparator;

import structure.Vegetable;

public class CaloriesOfVegetablesComparator implements SortingComparator {

    public int compare(Vegetable vegetable1, Vegetable vegetable2) {
        return Double.compare(vegetable2.getWeight(), vegetable1.getWeight());
    }
}
