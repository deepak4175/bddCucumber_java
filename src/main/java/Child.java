public class Child  extends Animal{
    @Override
    public String makeSound() {
        return "";
    }

    @Override
    public String eat() {
        return "";
    }

    @Override
    public void drive() {

    }

    @Override
    public void stop() {

    }


    @Override
    public void turnRight() {

    }

    @Override
    public void turnLeft() {

    }

    @Override
    public void honk() {
        super.honk();
    }

//    public void honk() {
//        System.out.println("child honk");
//    }

    public static void main(String[] args) {
        Car car = new Child();
     //   car.walk();
        car.honk();
        Car.test();
    }
}
