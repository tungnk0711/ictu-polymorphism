public class EWalletPayment extends PaymentObject {
    @Override
    boolean isPay(int amount) {
        System.out.println("EWallet Payment." + amount);
        return true;
    }
}
