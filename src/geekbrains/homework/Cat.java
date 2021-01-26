package geekbrains.homework;

public class Cat {
    private String name;
    private int appetite;
    public boolean hungry;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }
    public void eat(Plate p) {
      hungry = p.decreaseFood(appetite);
    }
    public void isHungry(){
        if(hungry)
            System.out.println("Im fine");
        else
            System.out.println("Im hungry(");
    }
}
