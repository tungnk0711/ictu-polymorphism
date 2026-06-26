public class EWalletPayment extends PaymentObject {
    
    @Override
    public boolean isPay(int amount) {
        System.out.println("EWallet Payment." + amount);
        return true;
    }
}
