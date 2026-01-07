public class CashPayment extends PaymentObject {
    @Override
    boolean isPay(int amount) {
        System.out.println("Cash Payment." + amount);
        return true;
    }
}
