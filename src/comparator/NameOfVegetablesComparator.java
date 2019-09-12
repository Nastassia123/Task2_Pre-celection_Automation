package comparator;

import structure.Vegetable;

public class NameOfVegetablesComparator {

    public int compare(Vegetable vegetable1, Vegetable vegetable2) {
        return (vegetable2.getName().compareTo(vegetable1.getName()));
    }

}
