public class Bird extends Animal implements IFlyAble, IRunable {
    @Override
    public void run() {
        System.out.println("Bird is running.");
    }

    @Override
    public void eat() {
        System.out.println("Bird is eating.");
    }

    @Override
    public void fly() {
        System.out.println("Bird is flying.");
    }
}
