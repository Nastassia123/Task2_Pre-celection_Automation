package structure;


public abstract class Vegetable {

    public double weight;
    public String name;
    public double calories;

    public Vegetable() {
    }

    public double getCalories() {
        return calories;
    }


    public String getName() {
        return name;
    }


    public double getWeight() {
        return weight;
    }


    public void setCalories(double calories) {
        this.calories = calories;
    }

    public void setName(String name) {
        this.name = name;
    }


    public void setWeight(double weight) {

        this.weight = weight;
    }


    public Vegetable(double weight, String name, double calories) {
        this.weight = weight;
        this.name = name;
        this.calories = calories;
    }


    @Override
    public String toString() {
        return "Name of product - " + name.toString() + " Product's weight - " + weight + " Product's calories - " + calories;
    }


}
