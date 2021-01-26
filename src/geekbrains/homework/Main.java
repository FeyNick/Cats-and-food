package geekbrains.homework;

public class Main {

    public static void main(String[] args) {
        Cat[] cat = new Cat[5];
        cat[0] = new Cat("Barsik", 10);
        cat[1] = new Cat("Murzik", 25);
        cat[2] = new Cat("Vovik", 30);
        cat[3] = new Cat("Zhorik", 10);
        cat[4] = new Cat("Murka", 8);
        Plate plate = new Plate(80);
        plate.info();
        plate.addFood(20);
        plate.info();
        for (int i = 0; i < cat.length; i++) {
            cat[i].eat(plate);
            plate.info();
            cat[i].isHungry();
        }
    }
}
