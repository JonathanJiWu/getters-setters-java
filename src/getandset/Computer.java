package getandset;

public class Computer {

    String name;
    int year;
    double cost;

    //setters
    public void setName(String name) {
        this.name = name;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    //    getters
    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public double getCost() {
        return cost;
    }
//empty constructor
    public Computer() {
    }

    public Computer(String name, int year, double cost) {

    }



}
