public class CashPayment extends PaymentObject {

    @Override
    public boolean isPay(int amount) {
        System.out.println("Cash Payment." + amount);
        return true;
    }
}
