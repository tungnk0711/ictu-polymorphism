public class AirPlane implements IFlyAble, IRunable {
    @Override
    public void fly() {
        System.out.println("AirPlane is flying.");
    }

    @Override
    public void run() {
        System.out.println("AirPlane is running.");
    }
}
