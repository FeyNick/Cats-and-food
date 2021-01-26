package geekbrains.homework;

public class Plate {
    private int food;
    public Plate(int food) {
        this.food = food;
    }
    public boolean decreaseFood(int n) {
        boolean amountOfFood;
        if(food < n) {
            amountOfFood = false;
            //System.out.println("Not Enough Food");
            return amountOfFood;
        }
        else {
            food -= n;
            amountOfFood = true;
            return amountOfFood;
        }
    }
    public void addFood(int n) {
        food += n;
    }
    public void info() {
        System.out.println("plate: " + food);
    }
}