public class Cat extends Animal implements IRunable {
    @Override
    public void run() {
        System.out.println("Cat is running.");
    }

    @Override
    public void eat() {
        System.out.println("Cat is eating.");
    }
}