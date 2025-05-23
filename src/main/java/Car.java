public interface Car {
    void drive();
    void stop();
    void turnRight();
    void turnLeft();
    default void honk() {
        System.out.println("honk");
    }
    static void test() {
        System.out.println("test");
    }
}
